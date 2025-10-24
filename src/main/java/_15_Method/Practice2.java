package _15_Method;

public class Practice2 {


    public static int calcTotal(int kor, int eng, int math){
        int sum = kor + eng + math;
        return sum;
    }

    //3차를 통해서 실행
    public static double calcAverage(int totalScore){
        return totalScore / 3.0;
    }

    public static String getGrade(double avg){
        String grade;
        if (avg >= 90){
          return  "A";
        }
        else if (avg >= 80){
          return  "B";
        }
        else if (avg >= 70){
          return  "C";
        } else {
            return "D";
        }
    }





    // 2차 실행

    public static void printStudentInfo(String name, int kor, int eng, int math){
        //메서드 세개를 완성해서 컴파일 에러를 없애주세요...,,,,,,,,,
        //calcTotal / calcAverage / getGrade를 작성해주세요,,,,,,,

        // calcTotal-> 리턴 int / 매개변수 : int ~~~
        int totalScore = calcTotal(kor, eng, math);
        //나머지도 작성
        double average = calcAverage(totalScore);
        //나머지도 작성
        String grade = getGrade(average);


        System.out.println("이름: "+ name + "학생" );
        System.out.println("총점: ");
        System.out.println("평균:  ");
        System.out.println("등급:  ");
    }

    //1차 실행
    public static void main(String[] args) {
        //학생 성적 관리
        printStudentInfo("김첡수",85,90,40);
        // main -> printStudentInfo -> calcTotal
        //                          -> calcAverage
        //                          -> getGrade

        //홑따옴표는 무조건 char(문자 하나)

        //나중에 호출된 stack 메모리가 먼저 정리된다  ==> 이게 무슨 말일까
    }
}
