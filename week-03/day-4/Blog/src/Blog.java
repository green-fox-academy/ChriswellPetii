import java.util.ArrayList;

public class Blog {
    static ArrayList<BlogPost> blogPosts = new ArrayList<>();

    static void add(BlogPost blogPost) {
        Blog.blogPosts.add(blogPost);
    }

    static void delete(int i) {
        Blog.blogPosts.remove(i);
    }

    static void update(int i, BlogPost blogPost) {
        Blog.blogPosts.set(i, blogPost);
    }

}
