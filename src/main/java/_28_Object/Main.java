package _28_Object;

public class Main {
    public static void main(String[] args) {
        /*
        Object 클래스 - 자바의 모든클래스의 최상위 부모 클래스
        extends Object - 모든 클래스는 Object를 상속 받고 있다.
        -> Object가 가진 메서드를 사용 할 수 있다
         - 대표적인 메서드 -
         1. toString()
         2. equals()
         3. hashCode()
         */

    ObjectStudent st1 = new ObjectStudent(22,"홍길동");

    // printf(), println() ->
    // 1. 원시값을 문자열로 변환해서 출력
    // 2. 객체들은 .toString()결과를 출력

    // Arrays.toString(): 미리누군가가 오버라이딩한 메서드를 우리가 갖다쓰는것
    // println 내부에서는 toString()을 호출하고 있음
    // 호출당하는 객체마다 서로다른 결과 -> 다형성.
    System.out.println(st1);

    ObjectStudent st2 = new ObjectStudent(22,"홍길동");
    // == 연산자 -> stack에 있는 값 비교
    // 참조자료형(객체) -> stack에 heap 주소저장 ==>

    System.out.println(st1 == st2); // false
    // 변수에 변수를 대입 -> stack에 있는 데이터를 복사해서, 대입
    // 매개변수로 데이터를 넘길때도 stack에 있는 데이터를 복사해서
    ObjectStudent st3 = st1; // 얕은 복사 ( 같
    System.out.println(st1 == st3); //true

    // 오버라이딩된 equals()호출
    System.out.println(st1.equals(st2)); //true

    String str1 = "Hello";
    String str2 = new String("Hello");

    System.out.println(str1 == str2); //false
    System.out.println(str1.equals(str2)); //true => String의 경우엔, equals로 비교한다
    }
}


// 같은문자의 참조자료형의 새로운 객체를 생성하면, 서로다른 스택과 힙에 저장되는가 ==> 클래스로 인스턴스를 정의하면, 같은 문자라고 하더라고
// 서로다른 힙에 저장된다 => 따라서 stack의 값은 둘이 서로 달라진다..