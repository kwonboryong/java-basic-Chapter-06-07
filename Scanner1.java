package Scanner;

import java.util.Scanner; // Scanner 사용 시 꼭 적어야함!

// Scanner = 사용자의 입력을 편리하게 받을 수 있는 클래스

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 변수 생성

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 사용자의 입력을 String으로 가져와서 str에 저장한다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt(); // 사용자의 입력을 int형으로 가져옴
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); // 사용자의 입력을 double형으로 가져옴
        System.out.println("입력한 실수: " + doubleValue);
    }
} // 다른 타입을 입력하면 에러가 뜨고 프로그램 종료된다.
