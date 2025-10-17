package _05_String;

public class StringMethod {
    public static void main(String[] args) {
        /*
        -자료형 분류
        1. 첫글자가 소문자인 자료형 : 원시 자료형
        -> int double, long, boolean
        2. 첫글자가 대문자인 자료형 : 참조 자료형
        -> Scanner, String, Array, 클래스..

        둘간의 차이점 : JVM(jaca virtual machine)
        -> 앞에서 다루었던, .class 파일을 읽고 os에 명령을 내리는 주체
        - JVM의 메모리 구조!
        1. Stack
            - 원시자료형(소문자 시작)의 실제값이 저장된다
            - 참조자료형의 메모리주소(heap에 있다)가 저장된다
        2. Heap
            -실제 참조 자료형의 실제값이 저장된다
        3. MethodArea(메서드 영역) - 차후에 설명
         */

        //엑셀로 이해
         int num = 10; //a2(stack)메모리주소에 저장되어있음
         // 참고) 메모리주소 16진수 - "0x"로 시작함 - 0x00007FFDEA2.. - 엑셀로 이해해보기

         //참조 자료형 - 참조 할 수 있다 (.으로 기능들을 사용할수 있다)\
         String name = "홍길동";
         // String의 참조기능

        //1. 실제 문자열 값 비교
        //   원시자료형은 '=='지교연산자로 비교했음
        //   '=='연산자는 stack에 저장된 값을 비교하는 것
        //   .equals()를 사용한다
        String str1 = "hello";
        String str2 = new String("hello");
        // 새로운 String 객체를 힙(Heap) 메모리에 생성해 줘!"라고 명령하는 거예요.
        // 보통 변수값을 동일하게 설정하면, 우선 기존의 풀에서 동일한 값을 가져오게된다.
        // 기존의 풀에서 가지고 오기 싫을때, new String(~~)를 써준다
        System.out.println(str1 == str2); //같을까 => heap에 값(출력값)이 아무리 같아도, 그해당값의 주소(stack)이 다르기때문에 false
        System.out.println(str1.equals(str2)); //문자열값의 올바른 비교

        //2. 다른 자료형끼리도 덧셈이 가능하다
        //덧셈연산시, 다른자료형이 문자열로 변한다
        System.out.println("점수 : " + 100+ "점"); //100은 int자료형

        // 3 주의: 연산자 우선순위 -
        // ( ) 1등이다
        // 대입이 꼴지다
        // 동등할 경우 왼쪽에서 오른쪽으로 진행
        // 다른 자료형과 문자열 연산시, 우선순위를 주의하자
        System.out.println("점수 : " + (10 + 5)+ "점");

        //String은 복합대입도 덧셈은 가능
         name = "홍길동";
         name += "님";


        //문자열은 단어들이 이어진 것이다 - 각 단어마다 순서가 있다
        // 순설를 index라고 부른다
        String str = "My name is Son";



        //4 문자열 길이 확인
        str.length();  //문자열의 문자갯수를 가져온다
        System.out.println("문자열 길이:" + str.length());

        //5 대소문자변환
        //toUpperclass
        //toLowerclass

        //6. 특정문자열의 포함 여부 // 결과 타입 : boolean 조건문하고 잘쓰임
        System.out.println(str.contains("name")); // true
        System.out.println(str.contains("age")); // true

        str = "we study JAVA";
        //7. 특정문자열이 어디서 시작하는지(index)를 찾기 // 결과값: int
        System.out.println(str.indexOf("study")); //index 3에서부터 시작함
        System.out.println(str.indexOf("python")); //없으면, -1에서 가져온다

        // 8. 부분문자열 추출 // 결과값 : String
        // index하나만 작성하면, 해당 index부터 끝까지 잘라옴
        System.out.println(str.substring(3));
        // index 2개를 작성하면 , index 3이상 8미만 꺼지 출력한다
        System.out.println(str.substring(3,8));

        //예제1) JAVA를 추출하기
        // 1. JAVA가 있는지 확인한다
        System.out.println(str.contains("Java")); // 있는지 확인
        // 2. "JAVA"의 위치를 찾는다
        int indexOfJAVA = str.indexOf("Java");
        // 3. 슬라이싱 해오자
        System.out.println(str.substring(indexOfJAVA));







    }
}
