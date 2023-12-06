package Casting;
public class Casting2 {
    public static void main(String[] args) {

        // 명시적 형변환(Casting) = 데이터의 타입 바꾸기
        // 큰 형 -> 작은 형 = 수동으로 형변환 필요
        // int -> long -> double
        // 형변환이 타입이나 값을 바꾸는 것은 아님!

        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int)doubleValue; // 형변환

        System.out.println(intValue);
    }
}
