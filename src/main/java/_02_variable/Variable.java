package _02_variable;

public class Variable {
    public static void main(String[] args) {
        // 변수 쓰는 이유 컨트롤 + d를 누르면, 아래로 복사
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        // hello -> world 변경하라
        // 노가다 -> 변수를 통해 특정값을 저장(Ram - 주로 기억하는 장치)
        // ram에 데이터를 저장하는 행위 = 변수 설정

        // 변수 선언( 빈 박스를 만들었다 )
        // 변수 선언 ( ram 메모리주소를 저장했다 )\
        // 자료형 변수명 순으로 작성
        String greeting;

        //변수 초기화
        // "="는 같다는 의미가 아니다
        // 우변의 데이터를 좌변의 변수에 저장하겠다
        greeting = "hello";
        //특정메모리주소인 greetinf에 hello라는 문자를 저장하겠다  = 초기화

        String academy = "Korea IT";

        //변수 재할당(이전에 있던 Hello는 사라짐
        greeting = "World";


        // 여러개를 한번에 초기화
        String city = "부산", name ="박화목";

        /*
        명명법
        1, 필수 규칙
            String 1name ..숫자로 시작할 수는 없다.
            String my_name  ..공백을 포함 할 수는 없다
            String class
            String if  ..자바 예약어는 사용할 수 없다

        2,관례(국룰)
            파스칼표기법  lastName, PascalCase - 클래스명, 파일명
            카멜표기법    lastName, pascalCase - 변수명, 함수(메서드)명

        3,매너
            의미없는 변수명을 사용하지말자
            bad ex)num1, a,b,c, temp(tmp,t)등등
            good ex) 현재 쇼핑카트에 담긴 물품 갯수
            numberofItemsCurrentlyInShoppingCart

         */


    }
}
