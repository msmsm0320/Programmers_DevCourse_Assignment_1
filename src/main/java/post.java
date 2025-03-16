public class post {

    public static long id;
    private String title;
    private String content;

    public void write(String title, String content){
        id++;
        this.title = title;
        this.content = content;
    }

    public void read(){
        System.out.println(title);
        System.out.println(content);
    }
    public void delete(){
        // 마지막으로 작성한 게시글 삭제
    }
    public void modify(){
        /*
        마지막 작성 게시글 수정
        수정시 제목, 내용 수정
         */
    }

}
