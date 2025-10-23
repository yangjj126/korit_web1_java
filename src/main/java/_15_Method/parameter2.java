package _15_Method;

public class parameter2 {
    public static void main(String[] args) {
       int num = 10;
       //퀴즈
        changeNumber(num);
        System.out.println(num); // 출력값? 10
        //함수별로 각기 다른 stack 메모리공간을 가지고 있기 때문이다

        /*
        stack(main) ----
        num:10
        stack(main) ----
        stack(changeNumber) ---
        number : 10 -> 12
        stack(changeNumber) ---
         */

        int[] nums = {1,2,3};
        System.out.println(nums[0]);
        // 퀴즈
         changArray(nums);
        System.out.println(nums[0]); //출력값 ? 999
        /*
        stack(main)-----
        nums: 0x1000
        stack(main)-----

        heap---
        0x1000: 1
         */
    }
}
