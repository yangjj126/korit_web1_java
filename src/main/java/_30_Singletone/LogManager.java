package _30_Singletone;

public class LogManager {
    /*
    디자인 패턴 -
    싱글톤( 스프링부트, 스프링에서 자주 등장 )
    **서버 전체**에서 단**하나의 인스턴스**를 공유하도록 하고 싶다.
    객체를 여러번 new로 만드는 것이 아니라 한 번만 만들고 재사용하고 싶다.

    언제씀? 어떤 객체를 싱글톤으로 설계해야할까
    - 상태(필드값 고정)가 존재하지 않을 때 : ex) service, controller, repository
    어떻게 구현할 수 있을까?
    1, 생성자 - 외부에서 new로 만들지 못하게 private로 제한
    2. 메서드로 하나만 돌려쓰게끔 구현
    3. 외부에 공유할 단 하나의 객체 변수를 필드로 가진다
     */

    // 외부접근을 막으면서, 전역에서 하나를 공유할 필드
    // 메서드 영역에 저장될 변수
    // instance 변수에 공유할 객체의 heap 주소를 저장
    private static LogManager instance;

    // 기본생성자
    private LogManager(){ } //private 외부에서 new 금지

    // 외부용 접근 메서드
    // static을 통해서 this와 무관하게 만든다
    // public(외부 접근용), static(객체 생성전에도 호출됨)
    public static LogManager getInstance() {
       // 단 하나의 객체를 사용하도록 코드를 구현
       if (instance == null){ // 한번만 실행
           instance = new LogManager(); // 저장된 heap 주소가 없다면,( 최초 1회만 실행 )
           //새로 하나 heap에서 메모리 만들어서, 주소를 대입해라
           instance = new LogManager();
    }
    // static은 객체 생성전에 호출된다
    return instance;
    }

    public void log(String msg){
        System.out.println("LOG" + msg);
    }


}
