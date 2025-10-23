package _13_Array;

public class StackHeap {
    public static void main(String[] args) {
        // JVM(자바코드를 운영체제로 전달해주는 소프트웨어)의 메모리
        // stack + heap + a....
        // stack: 고정크기, 작은 크기, 빠르게 접근가능, 원시자료형의 값
        // 원시자료형의 값/ 참조 자료형의 주소 (heap의 메모리 주소) 저장
        // heap: 유동적인 크기, 큰크기, 물어물어 찾아가야한다
        // 참조자료형의 값/ 주소 저장... JVM이 알아서 관리/정리한다

        //뭔 개소리 일까 내생각에는 여기서 90프로는 이거 이해못한다

        int age = 25;
        boolean isStudent = true;
        /*
        현재 stack:
        -main-
        age: 25
        isStudent : true
        scores: 0x1000(주소저장)

        int[] scores = { 25, 85, 90, 70 }

        현재 heap;
        0x1000: 85
        0x1004: 90
        0x1008: 70
         */
        // scores[1] -> 한칸아래에 있는 개새끼를 찾아와라 즉, 0x1000에서 int 자료형의 크기만큼 내랴가서 찾자 -> 90

        // ****** 변수에 변수를 대입하는 것 -> stack 값을 복사하는것 *********


        int[] scores = { 25, 85, 90, 70 };
        int[] copy = scores;

        /*
        현재 stack:
        -main-
        age: 25
        isStudent : true
        scores: 0x1000(주소저장)
        copy: 0x1000(주소저장)

        현재 heap;
        0x1000: 85 -> 999
        0x1004: 90
        0x1008: 70
         */
    } // main메서드 종료

      /*
        현재 stack:
        비어있음

        현재 heap:
        0x1000: 85 -> 999 (참조끊김) -> 알아서 메모리에서 내려감
        0x1004: 90 (참조끊김)
        0x1008: 70 (참조끊김)
        0x1000을 참조하는 변수가 없음 => JVM이 정리(가비지 콜랙터)
      */
}
