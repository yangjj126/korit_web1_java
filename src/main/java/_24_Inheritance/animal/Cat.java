package _24_Inheritance.animal;

public class Cat extends Animal {
    private String color;

    public Cat(){
        super();
        this.color = "회색";
    }

    public Cat(String name, int age , String color) {
        super(name, age);
    }
    // Jvm이 3가지를 구분한다


    // 부모의 메서드와 동일한 메서드 시그니처로 정의하면 된다
    // 메서드 = 메서드 시그니처 + 메서드 바디( 중괄호 - 구현부 )
    @Override
    public void eat(){
        System.out.println("고양이가 생선을 먹습니다");
    }

    @Override
    public void showInfo(){
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("털색: " + this.color);
    }





    // main에서 객체를 만들때, 이미 변수들을 다 받아온 상태이기 때문에
    // 변수를 안받아와도 된다 (못해도 괜찮다 질문해라)



}
