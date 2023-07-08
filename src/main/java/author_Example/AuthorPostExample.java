package author_Example;


import java.util.ArrayList;
import java.util.List;

public class AuthorPostExample {
	public static void main(String[] args) {
        // Create test data
        Author author1 = new Author("John", 1);
        author1.addPost(new Post("Post 1", 1));
        author1.addPost(new Post("Post 2", 2));

        Author author2 = new Author("Alice", 2);
        author2.addPost(new Post("Post 3", 3));

        Author author3 = new Author("Bob", 3);
        author3.addPost(new Post("Post 4", 4));
        author3.addPost(new Post("Post 5", 5));

        List<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        // Find authors who have posted on social media
        List<Author> authorsWithPosts = authors.stream()
                .filter(author -> !author.getPosts().isEmpty())
                .toList();
        
        
       
        // Print authors who have posted on social media
        authorsWithPosts.forEach(author -> System.out.println("Author: " + author.getName()));

        // Output: Author: John, Author: Alice, Author: Bob
    }
}
