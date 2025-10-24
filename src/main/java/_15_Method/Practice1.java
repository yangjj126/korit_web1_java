package _15_Method;

public class Practice1 {

    // 메서드 작성
    // 리턴을 실행하면,
    // 1. 메서드 즉시 종료, 2. 호출한 곳으로 리턴값 전달
    // 3. 메모리 정리( stack 정리 )
    public static boolean idEven(int number){
//        if (number % 2 == 0){
//            return true;
//        }
//        return false; //어차피 리턴때문에 종료되니깐
        return number % 2 == 0;
        // 이렇게 완전히 줄여볼수도 있겠다
    }

    public static boolean containsNum(int[] nums, int[] targets){
        int count = 0;
        int targetCount = targets.length;
        // nums안에 num이 있는가?
        for (int number : nums){
            for (int target : targets){
                if (number == target){
                    count++;
                }
            }
        }

        if (targetCount == count) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        // 1, 홀짝을 판단하는 메서드를 작성해주세요
        // isEven(8) -> true

        //2.배열과 숫자를 매개변수를 받아서, 숫자가 배열에 있는지 검사하는 메서드
        int[] nums = {1,3,7,9};
        // containsNum(nums, 8) -> false


    }


}
