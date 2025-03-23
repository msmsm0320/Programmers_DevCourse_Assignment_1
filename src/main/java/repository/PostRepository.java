package repository;

import data.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private List<Post> postList = new ArrayList<>();

    public void save(Post post) {
        postList.add(post);
    }

    public Post findById(long id) {
        if (id < 0 || id >= postList.size()) {
            return null;
        }
        return postList.get((int) id);
    }

    public void deleteById(long id) {
        if (id >= 0 && id < postList.size()) {
            postList.remove((int) id);
        }
    }

    public List<Post> findAll() {
        return postList;
    }
}
