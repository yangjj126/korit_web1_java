package _27_Interface;

public class AnimalManager {

    // AnimalManager 클래스의 makeSound의 의존성 : Animal 인터페이스
    // Dog 클래스의 의존성 : Animal... : AnimalManager을 의존x
    // Duck 클래스의 의존성 : Animal... : AnimalManager을 의존x
    // 의존성 방향 [Dog] -> [Animal] <- [AnimalManager]
    // -> 구체적인 클래스끼리 의존하는것이 아니라 인터페이스를 통해서 작동한다
    // -> 결합도가 낮다 ( 코드를 유연하게 변경 할 수 있다 )
    //  이상적인 구조 == ( 클래스가 인터페이스에 의존하는 구조 )
    public void makeSound(Animal animal){
        animal.sound();
    }

    public void makeFlying(Flyable flyable){
        flyable.fly();
    }

    public void makeSwimming(Swimmable swimmable){
        swimmable.swim();
    }
}
