package _13_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 참조자료형의 특징 - "."으로 참조할 수 있다
        // 배열 (Array) 또한 참조 자료형

        int[] original = {1,2,3,4,5};

        // 배열 내부를 볼떼, Arrays.toString(배열을 담은 변수)


        int[] copy1 = original; // 얕은 복사(stack값 복사)
        // 깊은 복사 : heap에 새로운 메모리를 할당해서 실제 값을 복사
        int[] copy2 = Arrays.copyOf(original, original.length);





        //완성안함










    }
}
