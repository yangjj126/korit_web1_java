package _18_Java2;

public class CarMain1 {
    public static void main(String[] args) {
        /*
        절차지향 프로그래밍 ( = 객체지향프로그래밍과 같이 사용가능 )
        : 객체지향의 반대말이 아니다
          실행 "순서" 중심

        객체 지향 프로그래밍:
             객체중심 ( 내부 코드를 숨긴다 - 캡슐화 )
             객체간 상호작용 중심
         */

        Car car = new Car();
        car.speed = 0;
        car.isEngineOn = false;

        //속도 증가
        car.speed  += 20;

        //속도 감소
        car.speed -= 100; // 실행은 된다
        System.out.println(car.speed); // 의도한 범위의 값이 아님

        // 객체의 상태(speed, isEngineOn의 값)이 바뀔때마다
    }
}
