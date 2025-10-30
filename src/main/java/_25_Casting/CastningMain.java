package _25_Casting;

import _24_Inheritance.car.Car;
import _24_Inheritance.car.ElectricCar;
import _24_Inheritance.car.GasCar;

public class CastningMain {
    public static void main(String[] args) {


        // 캐스팅 ? 타입 캐스팅 = 타입캐스팅
        // 상속에서의 캐스팅

        // 1. 업 캐스팅 : 자식클래스 => 부코클래스 타입으로 변환 ( 기능이 준다 )
        // 2. 다운 캐스팅 : 부모클래스 => 자식클래스 타입으로 변환 (기능이 늘어난다 )

        // 업캐스팅
        // new로 만들어진건 = 자식클래스
        // 변수타입 = 부모클래스
        Car car1 = new ElectricCar("현대");
        Car car2 = new GasCar("르노 삼성");

        // car1.charge(); 업캐스팅 되었기 때문에, Ecar의 메서드 호출 불가

        // 다운캐스팅
        // JVM
        Car Ecar = (ElectricCar) car1;
        //eCar.charge();
        // ㅇㅇ 존나 헷갈림

        // 컴파일러 / JVM을 구분해서 생각해야 한다
        // 객체 초기화에서 " = "기준으로 좌변은 컴파일러, 우변은 JVM

        // 컴파일러는 변수타입만 고려해서 코드 작성한다

        // JVM은 실제 메모리에 올라간것만 고려해서 작동
        // Car car1 = new ElectriCar("현대")

        // 메모리 => ElectriCar로 이해하고
        // 컴파일러 => Car로 이해함


        // 다운캐스팅 주의사항
        // 런타임 오류가 발생할 수 있음
        // 컴파일러는 Car -> ElectricCar로 다운캐스팅 용인 (타입 고려)
        // JVM입장에서는 Heap에= [battery | model ] 초기화를 해야하는데,
        // car2는  battery 필드가 존재하지 않음 -> 런타임 오류
        ElectricCar eCar2 = (ElectricCar) car2;
        // 컴파일러에서는 eCar을 Car로 받아들이기 때문에


        // instanceof 연산
        System.out.println(car2 instanceof ElectricCar);

        // 안전한 다운캐스팅
        // 조건문 + instanceof 연산자를 통해 런타임오류를 피할 수 있다
        if (car2 instanceof ElectricCar){
            ElectricCar eCar2 = (ElectricCar) car2;
        } else if (car2 instanceof GasCar){
            GasCar gCar = (GasCar) car2
        }

        Car tesla = new ElectricCar("모델S");
        // 메모리에는 ElectriCar이 올라감

        // isinstanceof 작동원리: 왼쪽객체가 오른쪽 타입의 대입할 수 있는가?
        System.out.println(tesla instanceof ElectricCar);
        System.out.println(tesla instanceof GasCar);
        System.out.println(tesla instanceof Car);

    }
}
