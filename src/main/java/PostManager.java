import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostManager {

    private static List<Post> postList = new ArrayList<>();

    public void operate(String op) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            System.out.println("명령어 > ");
            String input = sc.nextLine();

            switch (input) {
                case "작성":
                    System.out.println("작성할 게시물의 제목을 입력해주세요.");
                    String title = sc.nextLine();
                    System.out.println("작성할 게시물의 내용을 입력해주세요.");
                    String content = sc.nextLine();
                    
                    break;
                case "조회":
                    break;
                case "삭제":
                    break;
                case "수정":
                    break;
            }
        }
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
    public void delete(){
        // 마지막으로 작성한 게시글 삭제
        postList.remove(Post.class.countId);
    }
    public void modify(long id){
        /*
        마지막 작성 게시글 수정
        수정시 제목, 내용 수정
         */
        postList.get((int) id).setTitle();
        postList.get((int) id).setContent();
    }
}
