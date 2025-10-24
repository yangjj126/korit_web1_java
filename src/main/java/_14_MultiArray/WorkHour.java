package _14_MultiArray;

public class WorkHour {
    public static void main(String[] args) {
        // 직원 이름들
        String[] employeeNames = {"김철수", "이영희", "박민수", "최지우"};

        //근무기록
        // int[]를 저장하는 배열
        // int[]에는 순서대로 id, 근무시간, 시급이 기록되어있다
        int[][] workRecords = {
                {0, 40,10000}, // 김철수씨의 기록
                {1, 35,12000}, // 이영희의 기록
                {2, 20,9000}, // 박민수의 기록
                {3, 10 ,11000}, //최지우의 기록
        };

        // 1. 전체인건비계산
//        int totlaPay = 0;
//        for (int[]  record : workRecords){
//            int hours = record[1]; // 일주일동안 일한 시간
//            int wage = record[2]; // 시급
//            int pay = record[1] * record[2]; //주급
//            totlaPay += pay;
//        }

        // 2. 근무시간이 30시간 미만인 사람 출력

        // workRecords를 먼저 순회 => 30시간 미만인 사람의 아이디 찾는다
        // 그 아이디로 index와 같으니깐 그걸로 사람 출력

//  내가 만든 코드

//        int indexId = -1;
//
//        for (int i=0; i< workRecords.length; i++){ // { }을 계속해서 순회환다
//            int[] second = workRecords[i]; //workRecords -> second --- second는 순회하면서 값이 바뀌게된다
//            if(second[1] < 30){ // second[1] = 근무시간
//                indexId = i;
//                System.out.println("30시간 미만으로 일한사람: " + employeeNames[indexId]);
//                // 만약에 뒤에사람의 일한시간이 30시간미만이게 되면, 그런 경우도 포함해서 다 출력해줄 수 있다
//            }
//        }
//
//        if (indexId == -1){
//            System.out.println("30시간 미만인 사람은 없어요");
//        }


//강사 코드
        boolean found = false;
        for (int[] record : workRecords){
            int time = record[1];
            if (time < 30){
                found = true;
                int id = record[0];
                String name = employeeNames[id];
                System.out.println("30시간 근무 : "+ name);
            }
        }

        //순회끝나고, 작성한다
        if (!found) {
            System.out.println("30시간 미만 근무자는 없습니다");
        }




        // 3. "이영희"라는 사람이 있는가? -> 있으면, 이사람의 근무시간, 시급을 출력
//        String targetName = "이영희";
//        int targetIndex = -1;
//
//        for(int i =0; i< employeeNames.length; i++){
//            if(employeeNames[i].equlas("targetName")){
//                targetIndex = i; //찾으면, index업데이트
//                break;
//            }
//        }
//
//        if (targetIndex == -1){
//            System.out.println(targetName + " 은 존재하지않습니다");
//        }
//
//        //찾았다
//        //workRecords의 int[]에서 0번째에 있는게 id이자 index이다
//        for (int[] record : workRecords) {
//            if (record[0] == targetIndex) {
//                int od = record[0];
//                System.out.println("직원: " + targetName);
//                System.out.println("근무시간: " + record[1]);
//                System.out.println("시급: " + record[2]);
//            }
//        }
//
//
   }
}
