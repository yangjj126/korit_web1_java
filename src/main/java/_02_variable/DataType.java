package _02_variable;

public class DataType {
    public static void main(String[] args) {
        // 변수타입(자료형)이란,
        String name = "박화목"; //0,1로 이루어진 숫자로 바뀐다(2진수)
        // 변수 타입(자료형)이란 , 저장된 2진수패턴을 어떻게 해석할지 정함


        //종류
        //1. 정수 타입

        int intNum = 21; // 4byte = 32bit -> 42억개의 수를 표현 할 수 있다 / -21억 ~ 21억까지 가능

        //-----주로 사용하는것------
        long longNum = 3_000_000_000L; //8byte -> 용량이 제일 크다

        //2. 실수(소수점) 타입
        float smallBox = 3.14F; // 4BYTE - 소수점 7자리까지는 정확

        //---------주로 사용하는것 ------------
        double bigBox = 3.14; //8byte - 소수점 15자리까지 정확


        //3. 문자타입 - 글자 1개
        char char1 = 'A'; //char은 character, 아스키코드 A -> 65
        char char2 = 65 + 1; // 'B'
        System.out.println(char2);

        // 4. 문자열 --- 대문자로 쓰인다
        String str = "안녕하세요";

        // 5. 논리형 - TRUE OR FALSE만 저장
        boolean isEmpty = true;
        boolean isLogin = false;
        boolean hasMoney = false;


    }
}
