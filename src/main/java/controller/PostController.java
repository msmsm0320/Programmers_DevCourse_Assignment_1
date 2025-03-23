package controller;

import service.PostService;

import java.util.Scanner;

public class PostController {
    private final PostService service;
    private final Scanner scanner = new Scanner(System.in);

    public PostController(PostService service) {
        this.service = service;
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("명령어 > (작성 / 조회 / 수정 / 삭제 / 목록 / 종료)");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "작성":
                    createPost();
                    break;
                case "조회":
                    readPost();
                    break;
                case "수정":
                    updatePost();
                    break;
                case "삭제":
                    deletePost();
                    break;
                case "목록":
                    service.listAllPosts();
                    break;
                case "종료":
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("알 수 없는 명령어입니다.");
            }
        }
    }

    private void createPost() {
        System.out.println("제목을 입력하세요: ");
        String title = scanner.nextLine();
        System.out.println("내용을 입력하세요: ");
        String content = scanner.nextLine();
        service.createPost(title, content);
    }

    private void readPost() {
        System.out.println("조회할 게시물 ID를 입력하세요: ");
        long id = Long.parseLong(scanner.nextLine());
        service.readPost(id);
    }

    private void updatePost() {
        System.out.println("수정할 게시물 ID를 입력하세요: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println("새 제목: ");
        String newTitle = scanner.nextLine();
        System.out.println("새 내용: ");
        String newContent = scanner.nextLine();
        service.updatePost(id, newTitle, newContent);
    }

    private void deletePost() {
        System.out.println("삭제할 게시물 ID를 입력하세요: ");
        long id = Long.parseLong(scanner.nextLine());
        service.deletePost(id);
    }
}
