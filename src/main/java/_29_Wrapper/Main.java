package _29_Wrapper;

public class Main {
    public static void main(String[] args) {
        /*
        1. 원시자료형의 한계
           (첫글자 소문자)

           - 원시형은 객체가 아니므로 메서드를 가질 수 가 없음 ( 참조자료형과 달리 )
           -> 따라서 그때,그때 따로 만들어서 사용한다

       2. null 값을 가질 수 없다
       int[] socres ={70,60,30,0};
       scores[3]의 값이 0인데, 초기화가 안되서 0인지, 실제 정수가 0인지 모른다
       (원래 int는 초기화가 되지않으면 0이 출력된다)
       --> null로 명시되면 좋을텐데..
         */

        // 원시자료형 -> 래퍼클래스(박싱)
        // int를 감싸는 래핑클래스 : Integer
        Integer interger1 = Integer.valueOf(90); // 기본
        Integer integer2 = 90; //자동으로 컴파일러가 20번라인 코드로 변환해준다.....

        // Long을 감싸는 래핑 클래스: Long
        Long long1 = Long.valueOf(100L);
        Long long2 = 100L;

        // double -> double 클래스
        // boolean -> Boolean 클래스
        // float -> Float 클래스

        // 객체 -> 메서드 사용, Object를 상속받았음,
        // 원시 자료형이 아니니까, == 연산자 x

        Integer a = Integer.valueOf(1000);
        Integer b = Integer.valueOf(1000);
        System.out.println(a == b); //틀림
        System.out.println(a.equals(b)); // 올바른 방법. true

        // 반대로 래퍼클래스 -> 원시자료형(업박싱)
        // 객체.intValue(), 객체, longValue(), 객체.doubleValue()...
        int int1 = a.intValue();

        // 미리 정의되어있는 유틸 메서드
        int max = Integer.max(10,20); // 박싱 -> 언박싱
        int min = Integer.min(10,20); // 박싱 -> 언박싱
        int sum = Integer.sum(10,20); //박싱 -> 언박싱



    }
}
