package _17Class_;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스 -> 나만의 참조자료형을 정의하는것이다

        // 부연설명 : 참조자료형은 **스택(Stack)**에 저장된 '참조 변수'가
        // **힙(Heap)**에 생성된 실제 '객체'의 메모리 주소를 '가리키는' 방식으로 동작해.
        // Car이라는 객체에 int나 string놈들을 안에 넣어두는 것이다 뿐만아니라 클래스안에서만 쓸수 있는
        // 메서드도 넣어놓는다


        // 학생점수를 관리한다고 생각
        // 문제점 : 누구의 점수인지를 판단할 수 없다
        int[] scores = {80,90,40,60,50}; //누구의 점수인가
        String[] names = {"홍길동0", "홍길동1"}; //index끼리 동기화해서 사용

        // 이름은 홍길동이고, 국어, 영어, 수학점수를 몇점씩 저장
        // (학생이름, 국, 영, 수) -> 한셋트로 저장하고 싶다
        // (String, int, int, int) - > 자바에서는 이것들을 한셋트로 묶어주는 배열? x 자료형? x
        // 저런 자료들의 묶음을 직접 정의하겠다 -> 클래스 정의

        // 자료형 : Student 타입의 "STUDENT1" 변수 선언 -> stack에 student1생성
        Student student1;

        // new : 참조자료형의 데이터를 저장할때 (heap에 메모리 공간을 할당)
        // => 예를 들어, Student같은경우에는 int4개, string하나 포함된 메모리 공간이 생성
        // 메모리 주소(heap주소)를 student1 변수에 저장
        student1 = new Student(); //-> 이안에 변수넣기 가능?(질문) = 가능

        // student1의 주소에 접근하여, 필드값을 초기화
        // 필드값이란, 클래스내에서 정의된 변수
        student1.name = "홍길동";
        student1.korean = 90;
        student1.english = 80;
        student1.math = 70;


        // 선언과 생성을 동시에
        Student student2 = new Student();
        // student2가 담은 객체의 주소는 40번째 라인에서 생성되었다
        // student2가 담은 객체의 주소는 39번째 메모리에 없다


        // student1은 변수(객체주소를 담은 변수), Student는 클래스(자료형 타입)
        // 객체와 인스턴스는 같은 것이다..
        // student1과 student2는 객체(인스턴스)의 주소를 담은 변수이다(o)
        // student1과 student2는 Student 클래스로 만들어진 인스턴스이다(o)
        // Student는 객체다(x) -> 클래스는 객체가 아니다

        //엄밀히 말하면, 틀리지만, 자주 말하는것 => 뤼튼물어보기
        // student1, student2 -> 객체, 인스턴스

        //Student들을 저장하는 배열
        Student[] students = {student1, student2};
        // Student 타입의 배열을 만들어서, 그 안에 student1과 student2를 저장하는것




        /*
        클래스를 정의해주세요
        클래스이름 : Car
        필드 : brand(브랜드명) , model(모델명), year(출시년도)

        main에서 "현대-소나타-2023년"식을 만들라
         */

        Car car;
        car = new Car();
        // 선언과 초기화동시에 완성

        car.brand = "hyundai";
        car.model = "sonata";
        car.year = 2023;

        System.out.println("brandName : " + car.brand + System.lineSeparator() +
        "modelName : " + car.model + System.lineSeparator() +
        "publishYear : " + car.year
        );
    }
}
