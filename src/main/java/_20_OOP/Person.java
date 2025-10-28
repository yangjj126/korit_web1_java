package _20_OOP;

import java.util.Arrays;

public class Person {
    String name;
    int age;
    Friend[] friends;
    // 객체간의 관계 Person 객체 하나는 여러개의 Friend 객체를 가진다
    // 1:n 의 관계

    public Person(String name, int age, int count) {
        //객체 초기화전에 데이터 검증 필요함
        this.name = name;
        this.age = age;
        this.friends = new Friend[count];
    }

    // void는 실행만 할 것이다
    public void setFriend(Friend friend){
        for (int i = 0; i < friends.length; i++){
            if (friends[i] == null) {
                // == null이라는것은 빈자리에 집어넣게되는것이다.... 우선, friends[0]자리에 friend가 들어가고,그렇게되면,
                // friend[1]자리는 또 비게되니깐, 거기에 두번째 friend가 들어가는거다.. 차례대로 진행   // 즉 힙데이터안에 다가 다 넣어주는 것이다
                friends[i] = friend;
            }
        }  //클래스부분에서 Friend와 Person간의 연결이 이해안됨
    }

}
