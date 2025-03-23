package service;

import data.Post;
import repository.PostRepository;

import java.util.List;

public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public void createPost(String title, String content) {
        Post post = new Post(title, content);
        repository.save(post);
        System.out.println("게시물이 작성되었습니다. ID: " + post.getId());
    }

    public void readPost(long id) {
        Post post = repository.findById(id);
        if (post == null) {
            System.out.println("해당 게시물이 존재하지 않습니다.");
        } else {
            System.out.println("제목: " + post.getTitle());
            System.out.println("내용: " + post.getContent());
        }
    }

    public void deletePost(long id) {
        Post post = repository.findById(id);
        if (post == null) {
            System.out.println("해당 게시물이 존재하지 않습니다.");
        } else {
            repository.deleteById(id);
            System.out.println(id + "번 게시물이 삭제되었습니다.");
        }
    }

    public void updatePost(long id, String newTitle, String newContent) {
        Post post = repository.findById(id);
        if (post == null) {
            System.out.println("해당 게시물이 존재하지 않습니다.");
        } else {
            post.setTitle(newTitle);
            post.setContent(newContent);
            System.out.println(id + "번 게시물이 수정되었습니다.");
        }
    }

    public void listAllPosts() {
        List<Post> posts = repository.findAll();
        if (posts.isEmpty()) {
            System.out.println("게시물이 없습니다.");
        } else {
            for (Post post : posts) {
                System.out.println("ID: " + post.getId() + " | 제목: " + post.getTitle());
            }
        }
    }
}
