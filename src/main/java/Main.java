import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("명령어 > ");

        while(sc.hasNextLine()){
            String input = sc.nextLine();

            if(input.equals("exit") || input.equals("종료")){
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else{
                System.out.println("존재하지 않는 명령어 입니다.");
            }
            System.out.print("명령어 > ");
        }
        sc.close();

    }

}
