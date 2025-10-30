package _24_Inheritance.car;

public class GasCar {
    private int fuelLevel;

    public GasCar() {
        //super(); //생략가능하디
        System.out.println("GasCar 기본 생성자 호출");
        this.fuelLevel = 100;
    }

    public GasCar(String brand){
        super(); // -> 이 코드를 생략하면, 자동으로 super()이 삽입된다..즉, 기본 생성자가 자동으로 나오게 된다
        // 일단 나머지는 나중에 작성
    }

    // 메서드 오버라이딩 (0verriding) - over - writing이 더 맞는 말
    @Override //어노테이션(@) Override
    public void move(){
        // 부모에도 이미 존재해 있었다....
        // GasCar같은 경우에는 같은 이름으로 오버라이딩을 하겠다
        System.out.println("가솔린 차가 이동합니다");
    }

    @Override
    public void showInfo() {
        System.out.println("브랜드:" + brand);
        System.out.println("브랜드: 가솔린 차");
        System.out.println("연료 : " + fuelLevel);
    }

    //override문법 오류수정하기
}
