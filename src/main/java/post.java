public class post {

    public static long id;
    private String title;
    private String content;

    public void write(String title, String content){
        this.title = title;
        this.content = content;
    }

    public void read(){
        System.out.println(title);
        System.out.println(content);
    }
    public void delete(){}
    public void modify(){}

}
