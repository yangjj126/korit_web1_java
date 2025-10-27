package _16_Overloading;

public class Overloading {
    {
        // 메서드 오버로딩
        // 복습) 자바에서 메서드는 단독으로 존재할 수 없다
        // -> 메서드는 항상 "클래스"내에 종속된다

    }

    //동일 클래스 내에서 같은 이름의 메서드를 여러개 선언
    // 매개변수의 자료형(타임) / 순서/ 갯수가 다르면 같은 메서드 이름
    // 메서드 시그니처 : 컴파일러가 메서드를 구분하는 방법
    // 이름 + 매개변수 타입목록으로 구분한다

    // 시그니처 : printInfo 함수 (1: String)
    public static void printInfo(String name) {
        System.out.println("이름 : " + name);
    }

    // 시그니처 : printInfo 함수 (1: String, 2:int) - 순서가 달라도 다르다      ========== 시그니처는 메서드이름, 데이터타입배열만 본다
    public static void printInfo(String name , int age) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
    // 시그니처 : printInfo 함수 (1: int, 2:String )
    public static void printInfo(int age, String name) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    public class MyClass { // 예시로 클래스를 만들었습니다.

        public static void printNum(int num){
            System.out.println("정수!");
            System.out.println(num);
        }

        public static void printNum(double num){
            System.out.println("실수!");
            System.out.println(num);
        }

        // 해결 방법 1: 다른 이름의 메서드로 변경
        public static void callPrintNums(){
            printNum(1); // int 파라미터 메서드 호출
            printNum(1.0); // double 파라미터 메서드 호출
        }

        public static void main(String[] args) { // 실제로 프로그램을 실행하려면 main 메서드가 필요해요!
            callPrintNums(); // 새로운 메서드 호출
            // 또는 이렇게 직접 호출해도 좋아요!
            // printNum(1);
            // printNum(1.0);
        }
    }
}
