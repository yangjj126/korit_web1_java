package _13_Array;

public class Practice2 {
    public static void main(String[] args) {

        // 배열의 길이 활용
        int[] scores = {80,90, 75, 100, 65, 88, 91, 70};
        // 평균 -> 총합 / 갯수 (길이)
        double sum = 0;
        for (int score : scores){
            sum += score;  // sum = sum + score
        }
        double average = sum / scores.length;
        System.out.println("평균: " + average);

        // 실습3)
        // 추가 요구사항
        // 1. 평균 이상의 학생 수를 구해주세요 (int count)
        // 2. 최고점수를 찾아서 출력해 주세요 (int max)

        // 1.
        int count = 0;
        for (int score : scores){
            if (score >= average) {
                count ++;
            }
        }

        // 2.
        int max = 0;
        for (int score : scores) { // 배열에서 하나씩 커져오겠다
            if (score > max){ // 꺼내온 값이 현재 max보다 크다면,
                max = score;  // 현재max값으로 업데이트 하겠다
            }
        }




//        int count = 0;
//        for (int score : scores){
//            if (score > average) {
//                count++;
//            }
//        }
//        System.out.println(count);



    }
}
