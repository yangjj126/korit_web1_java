package _17Class_;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스 -> 나만의 참조자료형을 정의하는것이다
        // 학생점수를 관리한다고 생각
        // 문제점 : 누구의 점수인지를 판단할 수 없다
        int[] scores = {80,90,40,60,50}; //누구의 점수인가
//        String names = {"홍길동0", "홍길동1"}; //index끼리 동기화해서 관리

        // 이름은 홍길동이고, 국어, 영어, 수학점수를 몇점씩 저장
        // (학생이름, 국, 영, 수) -> 한셋트로 저장하고 싶다
        // (String, int, int, int) - > 자바에서는 이것들을 한셋트로 묶어주는 배열? x 자료형? x
        // 저런 자료들의 묶음을 직접 정의하겠다 -> 클래스 정의

        // 자료형 : Student 타입의 "STUDENT1" 변수 선언 -> stack에 student1생성
        Student student1;

        // new : 참조자료형의 데이터를 저장할때 (heap에 메모리 공간을 할당) => 예를 들어, Student같은경우에는 int4개, string하나 포함
        // 할당하고, 메모리 주소(heap주소)를 student1 변수에 저장

        student1 = new Student(); //-> 이안에 변수넣기 가능?(질문)

        // student11의 주소에 접근하여, 필드값을 초기화
        // arr[1] -> arr배열의 index 1에 접근
        student1.name = "홍길동";
        student1.korean = 90;
        student1.english = 80;
        student1.math = 70;


        // 선언과 생성을 동시에
        Student student2 = new Student();
        // student2가 가진 담은 객체의 주고는 33번째라인에서 생성되었다
        // student2가 담은 객체의 주소는 29번째 라인에서는 메모리에 없다 => heap주소를 담아준다


        // student1은 변수(객체주소를 담은 변수), Student는 클래스(자료형 타입)
        // 객체>? 인스턴스>?
        // 객체와 인스턴스는 같은 것이다..
        // 클래스와 객체인스턴스는 구분해라
        // student1과 student2는 객체(인스턴스)의 주고를 담은 변수이다(o)
        // student1과 student2는 Student 클래스로 만들어진 인스턴스이다(o)
        // Student는 객체다(x) -> 클래스는 객체가 아니다

        //엄밀히 말하면, 틀리지만, 자주 말하는것 => 뤼튼물어보기
        // student1, student2 -> 객체, 인스턴스

        //Student들을 저장하는 배열
        Student[] students = {student1, student2};

        /*
        클래스를 정의해주세요
        클래스이름 : Car
        필드 : brand(브랜드명) , model(모델명), year(출시년도)

        main에서 "현대-소나타-2023년"식을 만들라
         */




    }
}
