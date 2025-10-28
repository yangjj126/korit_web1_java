package _20_OOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("친구1");
        Friend friend2 = new Friend("친구2");
        Friend friend3 = new Friend("친구3");

        Person person = new Person("홍길동", 20, 3);
        person.setFriend(friend1);  // Person 객체가 friend1객체를 알게됨
        person.setFriend(friend2);
        person.setFriend(friend3);

        System.out.println(Arrays.toString(person.friends));
    }
}
