package Casting;

public class Casting1 {

    // 형 변환
    // int < long < double 순으로 큼
    // 작은 형 -> 큰 형은 자동 형변환 (묵시적 형변환)
    // 큰 형 -> 작은 형은 직접 형변환을 해줘야 함!

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long에 넣기 = 가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double에 넣기 = 가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double에 넣기 = 가능
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
