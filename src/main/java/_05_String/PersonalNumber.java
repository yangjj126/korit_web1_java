package _05_String;
import java.util.Scanner;

public class PersonalNumber {
    public static void main(String[] args) {

        //실습1)
        String pn = "991122-1234567";

        //1. 앞여섯자리만 추출
        //2. 성별코드(뒷자리 첫번째 숫자) 추출
        // 추력

        //1. 뭣 사용할것인가,음 substring을 사용해서 index가 0부터 6까지 출력
        //2. indexof7을 먼저 코드 입력하고, 출력

        //방법1: 대쉬직전까지의 문자열을 추출하라
        int dashIndex = pn.indexOf("-");
        String birthDate = pn.substring(0,dashIndex);

        //방법2
        birthDate = pn.substring(0, dashIndex);
        String gendercode = pn.substring( dashindex + 1, dashIndex + 2); //성별코드




        //실습2)
        System.out.println("이메일을 입력하세요 >>");
        Scanner scanner = new Scanner(System.in); //객체 생성
        String email = scanner.nextLine();
        boolean isValidEmail;
        String username;
        String domainName;

        //1. 입력한 이메일이 유효한가 -@이 있는가
        //2. 사용자 아이디추출
        // 3. 도메인(naver, gmail, daum등) 추출

//        isValidEmail = email.contains("@");
//        System.out.println(isValidEmail);
//
//        username = email.substring(0,email.indexOf("@"));
//        System.out.println(username);
//
//        domainName = email.substring(email.indexOf("@")+1,email.length());
//        System.out.println(domainName);

//////////////////////////////////////////////////////////////////////////////////////

        // 1. 입력한 이메일이 유효한가 -"@"있는가? "."있는가? 둘다 충족
        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        isValidEmail = hasAt && hasDot;
        // 2. 사용자id추출
        int atIndex = email.indexOf("@");
        username = email.substring(0,atIndex);
        //3. 도메인(naver, gmail, daum등...)
        String remain = email.substring(atIndex + 1); // @이후부터 끝까지
        int dotIndex = remmain.indexOf("."); // 잘라온것에서 "."위치를 찾음
        domainName = remain.substring(0, dotIndex); // 잘라온것에서 "." 직전까지

        System.out.println("유효한가요?" + isValidEmail);
        System.out.println("아이디" + username);
        System.out.println("도메인" + domainName);


        scanner.close();





    }
}
