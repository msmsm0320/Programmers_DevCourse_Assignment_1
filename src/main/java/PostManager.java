import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PostManager {

    private List<Post> postList = new ArrayList<>();

    public void operate() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("명령어 > ");
            String input = sc.nextLine();

            switch (input) {
                case "exit":
                case "종료" :
                    System.out.println("프로그램이 종료됩니다.");
                case "작성":
                    System.out.println("작성할 게시물의 제목을 입력해주세요.");
                    String title = sc.nextLine();
                    System.out.println("작성할 게시물의 내용을 입력해주세요.");
                    String content = sc.nextLine();

                    write(title,content);

                    break;
                case "조회":
                    String readPost = null;
                    String numberOnlyRead = null;
                    try{
                        System.out.println("어떤 게시물을 조회할까요? ");
                        readPost = sc.nextLine();
                        // 입력값에서 숫자만 추출
                        numberOnlyRead = getNumberOnly(readPost);
                        long idRead =  Long.parseLong(numberOnlyRead);
                        read(idRead);
                    }catch(NoSuchElementException n){
                        System.out.printf("%s번 게시글은 존재하지 않습니다.", numberOnlyRead);
                    }finally{
                        break;
                    }

                case "삭제":
                    System.out.println("어떤 게시물을 삭제할까요?");
                    String deletePost = sc.nextLine();
                    String numberOnlyDelete = getNumberOnly(deletePost);
                    long idDelete =  Long.parseLong(numberOnlyDelete);
                    delete(idDelete);


                    break;
                case "수정":
                    System.out.println("어떤 게시물을 수정할까요?");
                    String updatePost = sc.nextLine();
                    String numberOnlyUpdate = getNumberOnly(updatePost);
                    long idUpdate =  Long.parseLong(numberOnlyUpdate);
                    modify(idUpdate);
                    break;
            }
        }
    }

    private static String getNumberOnly(String readPost) {
        String numberOnly = readPost.replaceAll("[^0-9]", "");
        return numberOnly;
    }

    public void write(String title, String content){
        Post post = new Post(title, content);
        postList.add(post);
    }

    public void read(long id){
        String title = postList.get((int) id).getTitle();
        String content = postList.get((int) id).getContent();
        System.out.println(title + "\n" + content);
    }
    public void delete(long id){
        postList.remove((int) id);
    }
    public void modify(long id){
        /*
        마지막 작성 게시글 수정
        수정시 제목, 내용 수정
         */
        System.out.printf("%d번 게시물을 수정합니다.\n", id );

        System.out.print("제목:");
        Scanner sc = new Scanner(System.in);
        postList.get((int) id).setTitle(sc.nextLine());
        System.out.println();

        System.out.print("내용:");
        postList.get((int) id).setContent(sc.nextLine());
        System.out.println();

        System.out.printf("%d번 게시물이 성공적으로 수정되었습니다!\n",id);
    }
}
