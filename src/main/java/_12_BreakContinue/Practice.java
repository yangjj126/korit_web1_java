package _12_BreakContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /* 요구사항
        1사용자로부터 비밀번호를 받습니다
        2올바른 비밀번호 -> 로그인 성공
        3비밀번호가 틀리면, -> 비밀번호가 틀렸습니다 ! 출력 다시 입력
        4최대 5회까지 시도할 수 있음
        5 5회에 도달하면, "계정이 잠겨있습니다" 출력후 탈출
        6입력이 비어있으면 (" "), 다시 입력하세요 출력, 이때는 시도횟수 증가x
         */
        //빈문자열 검사 - 추가 설명 - 유효한 값인지 검사하는 것

        // 1. 빈 문자열 검사1 - "" - isEmplty(길이가 0인지 검사)
        // 2. 빈 문자열 검사2 - "" - isBlank(공백을 제거하고, 길이가 0인지)
        // 3. 문자열은 참조자료형 -> null검사!
        String test = "";
        System.out.println(test.length() == 0);
        System.out.println(test.isEmpty());  // 비어있으면, true

        test = "     "; //길이가 0이아니지만, 공백
        System.out.println(test.isEmpty()); //false
        test = test.trim(); //공백을 제거해준다
        String test2 = test.trim();
        System.out.println(test2.isEmpty()); //false
        System.out.println(test.isBlank()); // 공백 제거 -> 빈문자열 검사


        String PW = "1234";
        Scanner scanner = new Scanner(System.in);

        //시도횟수를 카운트 해줘야 한다
        int count = 0;
        while (true)
        {//int count = 0을 선언해주면, 다시 0으로 초기화된다
            System.out.println("비밀번호를 입력 >>");
            String myInput = scanner.nextLine();

            if (myInput.isEmpty()) { //공백 입력 처리
                System.out.println("다시 입력 하세요");
                continue;
            }

            count ++; //입력시 시도 횟수 증가

            if (myInput.equals(PW)){
                System.out.println("로그인이 성공했습니다");
                break;
            } else {
                System.out.println("비밀번호가 틀렸습니다");
            }

            if (count == 5){
                System.out.println("계정이 잠겼습니다");
                break;
            }
        }




//  아래부분은 내가 실행한 방법

//        for (int i = 1; i<=5; i++){
//            System.out.println("비밀번호를 입력하세요 : ");
//            String input = scanner.nextLine();
//
//            if (input.equals(PW)){
//                System.out.println("로그인 성공");
//                break;
//            }
//            else if (input.isEmpty()){
//                System.out.println("다시 입력하세요");
//                continue;
//            }
//            else {
//                System.out.println("비밀번호가 틀렸습니다 ! 다시 입력");
//            }
//
//            if (i == 5){
//                System.out.println("계정이 잠겼습니다");
//            }
//        }


    }
}
