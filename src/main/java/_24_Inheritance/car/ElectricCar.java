package _24_Inheritance.car;

// 상속은 어떻게 받는가? " extends _ 상속받을 클래스명"
public class ElectricCar extends Car {
    // protected brand -> 필드를 가지고 있게 됨
    private int batteryLevel;

    // 자식의 기본생성자
    // 부모의 기본생성자 (super())는 생략가능   => 무슨 말일까

    // 부모의 필드를 먼저 초기화, -> 자식의 필드를 초기화 한다
    public ElectricCar(){
        super(); // 부모의 생성자 호출; ( 상속하려면, 무조건 super()써줘야 함 ) // 부모의 기본생성자는 생략가능 - but 항상 먼저 호출
        System.out.println("전기차 생성자 호출");
        this.batteryLevel = 100;
    }

    // 전기차의 Heap 메모리 => 함정리하는것이 좋다
    // [brand | batteryLevel] -> 전체는 this, brand만 super
    // -> JVM이 부모부분만을 구분을 한다.
    // super. 부모의 메서드나 부모의 필드를 접근하겠다
    // 필드 : heap 에서 부모영역만 탐색해서 보겠다
    // 메서드 : 부모클래스 기준에서 호출하겠다 => 클래스 별로 구성되어있다 (음 , 메서드는 자식클래스 그리고 부모클래스 안에 있다 )


    public ElectricCar(String brand){
        super(brand);
        // 코드를 이런식으로 적으면,
        // Car의 String인 brand가 호출되는 것이다
        this.batteryLevel = 100;
    }

    // super. => 부모의 메서드를 호출하겠다
    public void moveWithInfo(){
        super.move();
        System.out.println("배터리 전량: "+ this.batteryLevel);
    }

    public void showDetailLeveInfo() {
        super.showInfo(); //부모의 showInfo()
        System.out.println("차종 : 전기차");
        System.out.println("배터리 전량 :" + this.batteryLevel);
    }

    public void charge(){
        System.out.println("배터리 충전합니다");
        this.batteryLevel = 100;
    }
}
