package _26_Abstract;

public class Main {
    public static void main(String[] args) {
        // 추상클래스는 직접 인스턴스(객체)를 생성할 수 없다
        // Character ch1 = new Character("테스트", 20,10)  ==> 컴파일 에러가 난다

        Character warrior1 = new Warrior("전사1");
        Character warrior2 = new Warrior("전사2");

        // 컴파일러는 부모클래스에 attack이 있는지 검사 -> 통과
        // JVM은 NEW로 생성된 객체의 attac()ghcnf
        // 오버라이딩이 강제된다
        warrior1.attack(warrior2);


        /*
        Mage클래스, Archer클래스 만들기
        Mage는 체력이 80, 공격 20
        공격시에는 name이 targetName에세 마법미사일 발사
         */
        System.out.println("-------------------");

        Character Mage1 = new Mage("메이지1"); //업케스팅


        Character[] characters = {warrior2, Mage1, warrior2};

        // 다형성
        // 추상 클래스 상속 -> 오버라이딩 강제 -> 다형성 보장
        // attack은 객체마다 다르게 설정
        for (Character ch : characters) {
            ch.attack(warrior1);
        }




    }
}
