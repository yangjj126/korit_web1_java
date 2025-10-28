package _21_Access;

public class Access {
    // 접근 제어자 - (클래스) , 메서드, 필드 모두 동일
    /*
    -접근제어자를 사용하는 이유
    데이터 보호 : 주소로 직접 참조하는 것을 막기 위함이다 -> 메서드로 접근하게 강제
    메서드로 접근 왜 함? = 검증된 값만 객체에 할당 하려고,
    정해진 방법으로만, 데이터를 변경하게 하여서 오류를 방지

    - 접근제어자의 종류(총 4가지가 존재)
    1. public
    - 가장 개방적이고, 어디서든 접근( "." ) 가능
    - 외부에 완전히 공개되는 API등에 사용

    2. protected
    - 같은 페이지 내부 && 상속관계 일때만 접근 가능(".")가능

    3. default
    - 같은 페이지 내부에서만 접근 가능하다

    4. private
    - 가장 제한적, 클래스내부가 아니면, 접근 불가능
    - 완전히 숨기기 가능 (Student.age, Student.name 같은거를 불가능하게 만들고 싶음)
    -> 메서드로 접근 ( 메서드는 public이 되어야 한다 )

    접근제어자 왜 필요하나 ... =>
     */


    // 접근제어자를 생략하면, default가 기본값이 된다

    private String data;
    // 이렇게 하면 절대 변경 못함. getData로만 변경가능

    // get필드명 : getter
    String getData() {
        return data;
    }

    public Access(String data) {
        this.data = data;
    }


    //나머지 다 적기 몰라ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
}
