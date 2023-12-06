package Scope;

public class Scope1 {

    // 스코프(Scope) = 변수의 접근 가능한 범위
    // 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. (스코프 생각하기!)

    public static void main(String[] args) {
        int m = 10; // 변수 m 생존 시작, main{} 안에서만 생존
        if (true) {
            int x = 20; // 변수 x 생존 시작, if문 안에서만 생존
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // 여기서부턴 변수 x는 생존 종료
        System.out.println("main m = " + m); // 변수 m은 main 안이기 때문에 생존!
    } // 변수 m 생존 종료
} // 생존 범위가 맞으면 접근할 수 있음 -> if문 안에서 변수 m에 접근할 수 있다.

