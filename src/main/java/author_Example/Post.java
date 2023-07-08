package author_Example;


public class Post {
    private String title;
    private int id;

    public Post(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}