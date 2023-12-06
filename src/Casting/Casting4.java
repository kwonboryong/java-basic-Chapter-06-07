package Casting;

public class Casting4 {

    // 자바에서의 계산
    // 1. 같은 타입의 계산 = 같은 타입의 결과
    // 2. 다른 타입의 계산 = 큰 타입으로 자동 형변환

    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // int / int = 1 (int)
        System.out.println("div2 = " + div2); // 1.0 (int를 double에 대입: 1 -> 1.0)

        double div3 = 3.0 / 2; // double / int => int -> double 자동 형변화
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // (double) 명시적 형변환 (수동 형변환)
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
