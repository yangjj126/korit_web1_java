package _30_Singletone;

// 이 친구를 싱글톤으로 구현하라
public class AppConfig {
    private String apiKey;
    private String appMode;


    private static AppConfig instance;

    // 상수
    public static final String DEV_MODE = "DEV_MODE";
    public static final String PRODUCTION_MODE = "PRODUCTION_MODE";
    // 상수도 문법이 기억이 안난다.....

    // 생성자 외부 호출 금지 ( private )
    private AppConfig() {
        this.apiKey = "MY_API_KEY";
        this.appMode = DEV_MODE;
    }

    public static AppConfig getInstance(){
        if (instance == null){
            instance = new AppConfig(); // private라도, 내부호출이니 상관x.....
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "apiKey='" + apiKey + '\'' +
                ", appMode='" + appMode + '\'' +
                '}';
    }

    public AppConfig(String appMode) {
        this.appMode = appMode;
    }
}
