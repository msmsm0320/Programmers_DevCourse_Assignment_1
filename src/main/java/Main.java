import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("명령어 > ");

        while(sc.hasNextLine()){
            String input = sc.nextLine();

            switch(input){
                case "작성" :
                    new post(){};
                    break;
                case "조회" :
                    break;
                case "삭제" :
                    break;
                case "수정" :
                    break;
            }
            System.out.print("명령어 > ");
        }
        sc.close();

    }

}
