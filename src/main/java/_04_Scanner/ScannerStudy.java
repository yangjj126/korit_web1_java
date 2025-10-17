package _04_Scanner;


import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 스캐너 = 외부(키보드)로부터 데이터를 받아오는 "객체"
        // 스캐너 객체 생성(우변에 있는 new) / Scanner라는 변수에 대입
        //지금은 외우고 사용
        Scanner scanner = new Scanner(System.in);

        // 1, 문자열 입력받기
        // println -> 문자열 출력이후에, 엔터까지 출력
        // print -> 문자열 출력하고, 엔터는 출력하지 않는다
        System.out.print("문자열을 입력하세요 >>");
        // scanner.nextLine(); //여기 담긴것은 사라진다

        //엔터키까지 인식해서 가져 옴
        String mystr = scanner.nextLine();
        System.out.println("입력한 문자열: " + mystr);






        // 2, 문자열과 정수 두개를 모두 입력받아보자
        System.out.println("나이를 입력 >>");
        int age = scanner.nextInt(); //키보드 입력(버퍼)에서 정수까지만 잘라옴
        // 33 + 엔터 에서 33까지만 가져오고 엔터는 남게됨

        scanner.nextLine(); //엔터제거용

        System.out.println("이름을 입력 >>");
        String name = scanner.nextLine(); //엔터까지 인식
        //남은 엔터를 먹고 사라짐
        System.out.println("나이 :" + age);
        System.out.println("이름 :" + name);

        scanner.close(); //스캐너 반납하고 끝남
    }
}
