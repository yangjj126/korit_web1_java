package _13_Array;

public class Arrray1 {
    public static void main(String[] args) {
        // Array(배열) : 같은 자료형의 많은 데이터를 한 번에 관리하는 저장공간
        // 연속된 공간 (메모리) 에 위치하기 때문에 팀색시 유리(빠르다)

        int score1 = 90;
        int score2 = 90;
        int score3 = 90;
        int score4 = 90;
        int score5 = 90;
        // 배열이 없다면, 이따구로 설정 메모리상으로도 존나 번거롭다. 따라서 한군데에 몰아넣고 싶다

        int[] scores = new int[5]; //int 자료 5개 들어갈 배열 생성
        scores[0] = 90;
        scores[1] = 90;
        scores[2] = 90;
        scores[3] = 90;
        scores[4] = 90;

        // 간단하게 배열 생성 / 초기화 한번에\
        int[] scores2 = new int[]{90,80,40,60, 100};
        int[] scores3 = {90, 80, 40 ,60, 100}; //가장 많이 사용

        //길이(공간 갯수) 배열명.length
        System.out.println(scores3.length);

        //자료형[] 배열이름 = {초기화할 데이터1, 초기화할 데이터2}

        // 배열 순회 - loop(for문과 자주 쓴다)
        String[] names = {"일길동", "이길동", "삼길동", "사길동", "오길동"};
        for (int i = 0; i < 5; i++){  // 배열이 추가되면, 조건문을 바꿔줘야한다
           System.out.println(names[i]);
        }

        //전형적인 배열의 순회 방법
        for (int i = 0; i < names.length; i++){  // 배열이 추가되면, 조건문을 바꿔줘야한다
            System.out.println(names[i]);
        }

        // 향상된 for문 - 항상 배열의 길이 만큼 순회 (파이썬 스러움)
        // for( 하나씩 꺼낸 데이터를 담을 변수 : 배열, 리스트..)
        // 가독성 좋다, 직관적 , 인덱스 접근을 막는다.
        for (String name : names){
            System.out.println(name);
        }
    }
}
