package _01_Print;

public class Printf {
    public static void main(String[] args) {
        /*
        형식지정자
        %d(deciminal) -> 정수
        %f(float) -> 실수
        %s(string) -> 문자열
        %ㅊ(character) -> 문자
         */

        int age = 25;
        double height = 173.5;
        String name = "홍길동";

        // "제 이름은 ~ 이고, 나이는 ~살이고, 키는 ~cm입니다"
        System.out.printf("재 이름은 %s이고, 나이는 %d살이고, 키는 %fcm입니다",
                name,
                age,
                height
                ); //순서에 맞춰서 형식지정자와 동기화 됩니다.
    }
}
