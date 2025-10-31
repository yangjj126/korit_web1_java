package _26_Abstract;


// 게임 캐릭터
public abstract class Character { // 추상 클래스
    // 추상 ( abstarct ) : 명세만 있고, 구체적인 구현은 없는 상태
    // 추상클래스 : 추상메서드를 하나 이상을  포함하는 클래스
    // 추상 메서드 : 메서드의 시그니처 저장, 구현(중괄호 안)을 생략

    // 상속받는 클래스에서는 반드시 추상메서드를 부모의 추상 메서드를 오버라이딩 해줘야 한다

    protected String name;
    protected  int HP;
    protected int attackDamage;

    public Character(String name,  int HP, int attackDamage) {
        this.attackDamage = attackDamage;
        this.HP = HP;
        this.name = name;
    }


    // 각 캐릭터마다 "공격하는 방식이 달라져야 한다"
    public abstract void attack(Character target); // 추상메서드
    // 이 친구를 이제 다 오버라이딩 할거야...

    public void showStatus(){
        System.out.println(name + " 체력 : "+ HP);
    }

    // 데미지를 받는 공통메서드
    public void receiveDamage(int damage){
        this.HP -= damage;
        if (this.HP <= 0){
            this.HP = 0;
            System.out.println(name + "죽었다...");
        }
    }

    public String getName(){
        return name;
    }

}
