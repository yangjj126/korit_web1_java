package _02_variable;

import java.sql.SQLOutput;

public class Personinfo {
    public static void main(String[] args) {
        //실습
        /*
              아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
              변수를 콘솔에 출력해 주세요
              1. 이름 2. 출생년도 3. 키(소수점포함.0)
              4. 혈액형 5.학생여부(true/false)
         */
        String name = "양준우";
        long birthYear = 20050712;
        double height = 185;
        char bloodType = 'B';
        boolean Student = true;

        System.out.println("이름" + name);
        System.out.println(birthYear);
        System.out.println(height);
        System.out.println(bloodType);
        System.out.println(Student);

        //백엔드쪽은 intellj, 프론트엔드쪽은 vscode
    }
}
