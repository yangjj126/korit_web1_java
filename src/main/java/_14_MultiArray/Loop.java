package _14_MultiArray;

import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},  //0
                {"B1", "B2", "B3", "B4", "B5"},  //1
                {"C1", "C2", "C3", "C4", "C5"}   //2
        };
        //seats.length는 3
        for (int i=0; i < seats.length; i++){ //seats안에 있는 배열들을 순회(A,B,C)
            String[] seat = seats[i];
            System.out.println(Arrays.toString(seat));
            for (int j=0; j < seat.length; j++){
                System.out.println(seat[j]);
            }
            System.out.println(); //엔터키
        }
        //이거 좀더 보고, 복습하고, 아무것도 안보고 작성








        int [][] nums = {
                {1,2,3,4,5}, //자료형 -> int[]
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        //nums에 있는 짝수들을 모두 더한값을 출력하라

        //1. for문으로 덩어리 3개 들고오기
        //2. 각각의 하나씩 다시 for문으로 조지기

        int evenSum = 0;
        for (int i =0; i< nums.length; i++){
            int[] num = nums[i]; //숫자배열
            for(int j = 0; j < num.length; j++){
                int myNum = num[j]; //숫자(int)
                if (num[j] % 2 == 0){
                    evenSum += myNum;
                }
            }
        }
        System.out.println(evenSum);

        //기억해라 for문이 오면은, 뭐가 오든간에 루프돈다








        String[] departments = {"인사부", "행정부", "사업부"};


    String[][] employees = { // 직원들 String[]배열을 저장하는 배열을 저장하는 배열 : String[][]
        {"김길동", "고길동","박길동"}, //인사부 String[]
        {"김영희", "이영희", "최양희"}, //행정부 String[]
        {"김철수", "박철수", "김길동"}  // 사업부 String[]
    };

    //1. 모든 부서를 통틀어서 깁씨성을 가진 사람들의 이름을 출력해줘
    // departments필요없음


        for (int i=0; i<employees.length; i++){
            // String[][]을 순회 -> 꺼내온것: String[]
            String[] employee = employees[i];   // String[]배열이나옴
            for (int j=0; j<employee.length; j++){
                String employ = employee[j];  // 안의 데이터들이 나옴
                if (employ.startsWith("김")){
                    System.out.println(employ);
                }
            }
        }







        //2. 사업부이면서, 김길동인 사람이 있는지를     --졸라 어렵다 이거 복습 빡세게
        // 확인할수 있는 코드 작성

        boolean found = false; //찾으면, true로 바꿀변수 (최종)
        int deptIndex = -1; //사업부가 있는지 확인하는 변수

        // 사업부가 있는 부서인가? departments순회
        for(int i=0; i<departments.length; i++) {
            //String[]배열을 순회 -> 가져온것 : String
            String deptName = departments[i];
            if (departments.equals("사업부")){
                deptIndex = i; //찾으면, 인덱스를 업데이트 해준다
                break;
            }
        }

        if (deptIndex == -1) {  //"사업부"가 없을때
            System.out.println("사업부는 없습니다");
            return; //main 메서드 즉시 종료
        }


        //사업부 사람들 명단 ->  String[]
        String[] buissDept = employees[deptIndex]; //employees[2]
        for (int i = 0; i <buissDept.length; i++){
            //String[]을 순회 -> 꺼내온것 : String
            String name = buissDept[i];
            if (name.equals("김길동")){
                found = true; //찾으면  true로 업데이트
                break;
            }
        }

        if (found) {
            System.out.println("사업부에 김길동이 있습니다");
        } else {
            System.out.println("사업부에 김길동이 없습니다");
        }

        //다중배열
        //String[][] -> String[][]을 저장하는 배열
        //String[] -> String을 저장하는 배열
        //String[][][] names = {{{}, {}}, {{}, {}}, {{}, {}}};
        //names[1] -> String[][]들이 저장되어있는데, 그중 index가1인것을 가져오라는거구나
    }
}
