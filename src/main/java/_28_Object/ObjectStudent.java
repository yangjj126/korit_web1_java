package _28_Object;

import java.util.Objects;

public class ObjectStudent {
    private String name;
    private int age;

    public ObjectStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 1. toString()\
    // Object 클래스에서 toString의 정의 : 클래스풀네임 + @ + 해시코드(16진수)
    // 객체의 상태(필드값, 멤버변수값) 정보  ==>   문자열로 표현해주는 메서드
    // 로깅목적, 디버깅용  => 로깅이란?..

    // object의 toStraing은 이상한거 출력

    @Override
    public String toString(){
        String data = "이름 = "+ this.name + "나이 = "+ this.age;
        return data;
    }

    // 2. equals()
    //  "문자열".equals("문자열") -> String은 객체이기 때문
    // Object.equals() 는 == 연산자와 동일하게, 주소값을 비교하고 있음  => "문자열".equals("문자열")이랑 Object.equals()는 포함관계인가? nono 오버라이딩 시킨것


    @Override
    public boolean equals(Object o) {
        // null 검사, 클래스이름이 다르면, false
        if (o == null || getClass() != o.getClass()) return false;
        ObjectStudent that = (ObjectStudent) o;
        // 필드 값 비교
        // 원시 자료형은 == 연산자료
        // 참조자료형은 Object.equals()로 필드 비교
        return age == that.age && Objects.equals(name, that.name);
    }

    // 1. ** equals()를 재정의 하면,반드시 hashcode()도 오버라이딩해야한다 ** => 나중에 설명 (hash는 나중에api할때)
    // 2. HashMap, HashSet등 해시기반 컬렉션자료형때, 사용한다 - 동등성(중복)에 관한 이야기
    // 3. hash : 함수에 값을 넣어서, 나온 값으로 비교
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
