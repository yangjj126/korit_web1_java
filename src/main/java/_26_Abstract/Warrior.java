package _26_Abstract;

public class Warrior extends Character {
    // 생성자 만들고, attack메서드도 바로 구현 해줘야 해....
    public Warrior(String name) {
        // 전사
        super(name, 120, 25);
    }

    @Override
    public void attack(Character target) {
        // 음 Character을 통해서
        // Character 안의 메서드를 사용하기 위해서, target을 Character 타입으로 지정해준것이다.
        String targetName = target.getName();
        System.out.println(name + "이" + targetName + "에게 강렬하게 공격함");
        target.receiveDamage(attackDamage);
        System.out.println(targetName + "이" + attackDamage + "의 데미지를 받았습니다" );
    }
}
