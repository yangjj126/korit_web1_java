package _27_Interface;

public class Main {
    public static void main(String[] args) {
        /*
        상속(is - a)의 한계
        상속은 is - a관계 => Archer is a Character
        1. 자식클래스로 갈수록 , 기능이 방대(extend)해진다 -> 확장은 쉽다.
        2. 가중상속이 불가능하다(super 때문에), 하나의 클래스는 하나의 부모클래스만 가진다.
           -> 조립은 불가능한것 같다, 혹시 조합이 잘 안되는거 아닐까

           인터페이스
           인터페이스는 can - do 관계이다 (자격증)
           1. 조합 / 조립
           2. 다중상속이 가능하다!! -> (super을 아써도됨)
              -> 필드가 없음 (상태가 존재하지 않음)
              -> 메서드 시그니처만 정의 (what is signature) super도 없다
           3. Method Area 에만 정보가 존재 ( 생성자 X -> 객체 생성이 X )
         */



        // 다형성
        Animal dog = new Dog(); // 사이드 캐스팅
        Animal duck = new DUCK(); // 사이드 캐스팅

        Animal[] animals = {dog, duck};
        for (Animal animal : animals){
            animal.sound(); //다형성

            // animal이 Flyable로 캐스팅이 가능하다면
            if (animal instanceof Flyable) {  //인스턴스오브 뜻은?
                // 임시 캐스팅 : 캐스팅했다가, 다시 캐스팅취소로
                ((Flyable)animal).fly(); //잠깐 animal이 flu가 가능하게끔 하도록 설정한다
            }

            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }

            Dog dog2 =  new Dog();  //캐스팅x
            DUCK duck2 = new DUCK(); //캐스팅x
            AnimalManager manager = new AnimalManager();

            // 매개변수로 넘어갈때, Animal타입으로 자동으로 캐스팅된다
            // => 인터페이스와 클래스간이동이 자연스러운가? ㅇㅇ implements만 잘 사용해
            // => "혹"은 무족건 인터페이스, "본체"는 클래스 이다, 그리고 인터페이스는 자격증 인거고, implemants는 다리 역할
            manager.makeSound(dog2);
            manager.makeSound(duck2);

            // 매개변수로 넘어갈때,
            manager.makeSwimming(dog2);
            manager.makeSwimming(duck2);
        }
    }
}
