package _26_Abstract;
        /*
        Mage클래스, Archer클래스 만들기
        Mage는 체력이 80, 공격 20
        공격시에는 name이 targetName에세 마법미사일 발사
         */
public class Mage extends Character {
    public Mage(String name) {
        super(name, 80, 20);
    }

    @Override
    public void attack(Character target) {  // target 또한, Character의 객체이다...
        String targetName = target.getName();    // 음,
        System.out.println("공격시에는" + name + targetName + "에게 마법미사일 발사..");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이" + attackDamage + "만큼 피해를 받았습니다");
    }

    //공격시에는 name이 targetName 에게 마법미사일 발사
}

