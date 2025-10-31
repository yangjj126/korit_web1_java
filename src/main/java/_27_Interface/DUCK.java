package _27_Interface;

public class DUCK implements Animal, Flyable, Swimmable{
    @Override
    public void move() {
        System.out.println("꽥");
    }

    @Override
    public void sound() {
        System.out.println("뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("오리 난다");
    }

    @Override
    public void swim() {
        System.out.println("오리가 헤엄칩니다");
    }
}
