package Scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        // int temp = 0; // 안 좋은 코드
        // temp는 if문에서만 사용할 임시변수, 굳이 main 영역에 선언할 이유가 없음(비효율적인 메모리 사용, 코드 복잡성 증가)
        if (m > 0) {
            int temp = 0; // if문에 넣는게 좋음
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
 // * ctrl + N = 파일 찾기
 // * ctrl + E = 이전으로 돌아가기