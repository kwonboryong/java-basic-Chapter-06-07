package Scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10; // for문에 접근 가능
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // 변수 i 생존 종료
        System.out.println("main m = " + m);
    } // 변수 m 생존 종료
}
