package _21_Access;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Access access = new Access("데이터 입니다");
        System.out.println(access.getData());

    // data의 접근제어자가 private가 되어서
    // 직접참조(.)을 할 수 가 없다

    //access.data = "에러나라!"; //참조해서 변경
    //System.out.println(access.data); //참조
    // => private 으로하면 이렇게 불가능

    access.setData("메서드로만 변경가능");
    }
}
