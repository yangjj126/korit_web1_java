package _12_BreakContinue;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break, continue
        // break를 만나면, 반복문 ( for문 or while문의 중괄호 )를 한 번 탈출 한다

        for (int i = 1; i <= 10; i++){
            System.out.println("현재 번호: " + i);
            // 현재 번호 : 3 을 콘솔에 출력하고, 반복문 탈출
            if (i == 3) {
                break; //for문의 중괄호를 한 번 탈출한다
            }
        } // break를 읽으면, 여기로 탈출한다

        // 웨이팅 - 50명
        // 재고 - 10개
        int waiting = 50;
        int stock = 10;
        // 웨이팅 만큼 반복
        for (int i = 1; i <= waiting; i++){
            System.out.println(i + "번쩨 손님 입장");
            if (i == 10){
                System.out.println("재고 소진");
                System.out.println("영업 종료");
                break;
            }
        }

        String password = "1234"; // 해당 password는 문자열인가 아니면, 숫자배열인가 음.,,
        Scanner scanner = new Scanner(System.in);
        while(true) {
            //비밀번호를 입력받았을때, 비밀번호를 맟풀경우에만 탈출
            System.out.println("비밀번호 입력 >>");
            String myInput = scanner.nextLine();

            //탈출조건
            if (myInput.equals(password)) {
                System.out.println("로그인 성공");
                break; //while 문의 중괄호 탈출
            }
        }

        //중첩될경우, (가장 가까운 바깥쪽 반복문의 중괄호) 를 한 번 탈출한다

        // 실습) 1 ~ 100까지의 누적합을 합니다 (for문)
        // 그깨, 합계가 200이 넘어가면 스탑 ( == 조건문을 쓰라는 단축 )
        // 스탑했을때, 1. 마지막 더한 수, 2. 최종합계 출력
        int sum = 0;
        int i;

        for (i=1; i<=100; i++){
            sum += i;
            if (sum > 200){
                System.out.println("마지막 더한 수" + i);
                System.out.println("최종합" + sum);
                break;
            }
        }
    }
}
