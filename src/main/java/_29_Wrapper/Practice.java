package _29_Wrapper;

public class Practice {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        // 1. integer 배열로 변환하기
        // Integer.valueOf(int값) => 박싱
        // scores를 for문을 돌면서, 박싱을 해줘야겠다
        // 어디에 담지?? -> Integer배열을 하나 만들어야 겠다...
        Integer[] integers = new Integer[scores.length];
        // 이거 생각하는게 조금 힘들었을듯.. ㅇㅈ


        // 2. 최고점, 최저점 적절한 Integer 메서드를 사용해서 구해주세요

        for (int i =0; i< scores.length; i++){
            integers[i] = scores[i]; //이거 나중에 강사님이 하신방법으로 해보기
        }
        // 1. 최대 , 최소
        Integer maxScore = integers[0];
        Integer minScore = integers[0];
        // max의 경우에는, 상관이 없는데, min의 경우에는, minScore을 0으로 해주면,
        // 항상 미니멈값이 0이 나오게 된다
        for (int j =0; j<scores.length; j++){
            Integer max = Integer.max(maxScore, integers[j]); // for 문을 통해서 둘간의 비교를 한다.
            maxScore = max;
            Integer min = Integer.min(minScore, integers[j]);
            minScore = min;
        }
        System.out.println(maxScore);
        System.out.println(minScore);
        // 아래것에 강사님 방식 적어보기...
        // 핵심은 음, 최대와 최소를 구하는 과정을 for문을 통해서 한번에 처리할 수 있다는 것이다
    }
}
