package data;

public class Post {

    private static long countId = 0L;
    private long id;
    private String title;
    private String content;

    public Post(String title, String content) {
        id = countId++;
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId(){
        return (int) id;
    }

    public static int getcountId(){
        return (int) countId;
    }


}
