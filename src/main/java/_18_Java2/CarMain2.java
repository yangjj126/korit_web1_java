package _18_Java2;

public class CarMain2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 0;
        car.isEngineOn = false; //필드 초기화

         car.engineStart(); // 객체의 상태(필드값)을 메서드로 접근하여




        // 객체(주어) + 동사(메서드) -> 가독성이 좋아진다
        // 자동차, 엑셀 밟기, 자동차, 브레이크 밝기

        //객체 지향 프로그래밍에서 가장 중요한것은
        // 객체의 상태값을 검증할 수 있다 -> 문법적으로 강제하자 (문법이 찐 법이다)

        /*
        1. 캡슐화 - 데이터의 속성과 메서드를 하나의 캡슐에 담는것
                 - ** 상태값을 주소로 접근하는 것을 막는 것 **        => 이거 잘 이해가 안됨(질문)

        2. 추상화(나중에)
        3. 상속(나중)
        4. 다형성(나중)
         */

    }
}
