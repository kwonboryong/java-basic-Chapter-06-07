package Scanner;

// 사용자의 입력을 받아 그 합계를 계산하는 프로그램 만들기
// 사용자는 한 번에 한 개의 정수를 입력할 수 있다.
// 사용자가 0을 입력하면 프로그램 종료.
// 이때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력해야 한다.

import java.util.Scanner;

public class Scanner_While3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0; // sum에 사용자 입력값 누적

        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료):");
            int number = input.nextInt(); // 사용자로부터 정수 입력 받기

            if (number == 0) {
                break;
            }

            sum += number; // sum에 사용자가 입력한 number 값을 누적해서 더함
        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
