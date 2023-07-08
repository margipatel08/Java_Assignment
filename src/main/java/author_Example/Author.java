package author_Example;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private int id;
    private List<Post> posts;

    public Author(String name, int id) {
        this.name = name;
        this.id = id;
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
