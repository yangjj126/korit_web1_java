package _30_Singletone;

public class Main {
    public static void main(String[] args) {
        //LogManager logger1 = new LogManager();

        // 스태틱메서드로 접근
        LogManager logger1 = LogManager.getInstance();
        logger1.log("첫번째 로그");

        LogManager logger2 = LogManager.getInstance();
        logger1.log("두번째 로그");

        // 정말 같은 주소 일까
        System.out.println(logger1 == logger2); // true
        // 정말로 하나의 객체를 사용하더라

        // new를 했을때, 메모리 낭비가 될 수 있다

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config1 == config2);
        System.out.println(config1);
        System.out.println(config2);

        // 설정값(객체 상태)를 공유한다
//        config1.setAppMode(AppConfig.PRODUCTION_MODE);
        //뭐가 잘못 된걸까,,,

        // config1과 config2의 상태모두 변경 -> 같은객체다
    }
}
