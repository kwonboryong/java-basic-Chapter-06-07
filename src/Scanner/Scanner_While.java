package Scanner;

// 사용자가 입력한 문자열을 그대로 출력하는 프로그램 만들기
// exit라는 문자가 입력되면 프로그램을 종료
// 프로그램은 반복해서 실행된다

import java.util.Scanner;

public class Scanner_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit:종료): ");
            String str = scanner.nextLine(); // 사용자로부터 입력 받기

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }
    }
}
