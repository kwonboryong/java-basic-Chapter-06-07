package Casting;

public class Casting3 {
    public static void main(String[] args) {

        // 오버플로우 = 형의 기존 범위를 초과하여 전혀 다른 숫자를 표현하는 현상
        // 오버플로우가 발생하는 것 자체가 문제! -> 큰 타입으로 바꿔서 값의 범위를 늘려주기

        long maxIntValue = 214748367; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 = int 범위 초과이기 때문에 L을 붙여야 함
        int intValue = 0;

        intValue = (int)maxIntValue; // long -> int로 형변환 (값이 int 범위 내이기 때문에 멀쩡)
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int)maxIntOver; // long -> int로 형변환 (값이 int 최고값보다 큼)
        System.out.println("maxIntOver casting = " + intValue);
        // int 범위를 넘으면 int 값의 가장 작은 숫자부터 다시 반복된다. (시계 분침처럼)
    }
}
