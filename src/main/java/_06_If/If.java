package _06_If;

public class If {
    public static void main(String[] args) {


        /*
        if (boolean 데이터 - 비교, 논리 연산식) {
        }
         */

        int height = 130;
        int age = 23;

        if (height >= 120) {
            System.out.println("탑승가능");
        }

        if (height >= 120 && age < 14) {
            System.out.println("탑승가능");
        }

        // if ~ else if ~ else
        // 하나의 조건이 만족되면, 나머지는 검사하지 않는다
        // 단 하나의 블록만 실행!


        //코드는 위에서 아래로 흐른다
        //오름차순, 내림차순으로 작성해야한다
        // else if 조건이 검사되는 경우: 위의 조건들이 모두 false였다
        age = 15;
        if (age <= 7){
            System.out.println("미취학 아동");
        } else if (age <= 13){ // age > 7
            System.out.println("초등학생");
        } else if (age <= 16){ // age > 7 and age > 13
            System.out.println("중학생");
        } else if (age <= 19){
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        boolean isLogin = false; // 로그인되었는가
        boolean isBanned = true; // 가입된 계정이 밴계정인가

        if (!isLogin) { //로그인 안되었을때, 실행
            System.out.println("로그인이 필요합니다");
        } else if (isBanned) { //로그인되었다고, 거정하고 실행해야함
            System.out.println("정지된 계정입니다");
        }

        //등급제, 권한,
        //클라이언트 조건 검사
        boolean  isClient = true;

        //실행할때는 순서 X,  유지보수 측면에서 오름, 내림차순
        boolean  isVIP = false;
        boolean  isGold = true;
        boolean  isSILVER = false;


        //강사님 레포 :  github.com/elikese


    }
}
