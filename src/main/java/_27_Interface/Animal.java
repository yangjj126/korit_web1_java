package _27_Interface;

public interface Animal {
    // 필드 선언 불가능
    // 내가 수업안들은것, static...
    // 상수는 선언이 가능하다
    // 상수는 선언이 가능하다 (값의 경우, public static final은 생략가능) - String name = "NAME";

    // 모든 메서드가 public abstract가 붙는다 (생략가능)
    // -> 시그니처만 정의
    void sound();
    void move();


}
