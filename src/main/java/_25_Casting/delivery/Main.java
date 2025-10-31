package _25_Casting.delivery;

public class Main {
    public static void main(String[] args) {
        // 업캐스팅 상태로 생성
        // 업캐스팅 개념 좀 더 보완하기
        Delivery d1 = new Normal(10, 5); // 업캐스팅
        Delivery d2 = new Fast(10, 5); // 업캐스팅
        Delivery d3 = new Slow(10, 5);

        Delivery[] dList = {d1, d2, d3};

        // 오버라이딩된 calcFee() 호출!
        // 다형성: 같은 메서드(코드변경을 안해도되겠네?)를 호출 -> 서로 다른 동작
        // 컴파일러에러 회피: 오버라이딩된 메서드(부모도 같은 메서드가 있다)
        // JVM: 실제객체 기준으로만 메서드를 호출!
        for(Delivery d : dList) {
            d.printInfo(); // 부모의 메서드(내부에는 calcFee() 호출)
        }
        // 컴파일러의 경우에는, 음, printInfo -> 부모클래스에 있다 -> 런타임오류가 발생안함
        // 대신에 내부적으로는 객체마다 다르게 printInfo -> class마다 음,서로 오버라이딩된, calcFee가 작동하면서
        // 그 이유는 음, 메모리는 클래스마다 다르게, 메서드를 저장하는데, 음 , calcFee가 다르게 저장되어있다
    }
}
