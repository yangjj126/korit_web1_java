package _18_Java2.Phone;

public class PhoneMain {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        //초기화(직접 접근중)
        myPhone.battery = 50;
        myPhone.isPowerOn = false;

        // 캡슐화 - 내부구현은 main에서는 알 수 없다
        // myPhone은 주소로 직접 접근하지 않는다 ===> 이게 뭔말이냐
        myPhone.turnOn();
        myPhone.turnOff();
    }
}
