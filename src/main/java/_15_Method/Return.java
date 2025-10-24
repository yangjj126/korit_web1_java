package _15_Method;

public class Return {

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    //2. 객체로 다루기
    public static String addNim(String name) {
        // 홍길동 -> "홍길동님"
        return name + "님";
    }

    public static void main(String[] args) {

        // return -> 호출결과
        // 리턴되는 데이터가 값이라면 값,
        // 객체라면, 객체로 다룰 수 있다 (참조(.) 할 수 있다)

        //1. 값으로 다루기
        int sum = add(10,20);
        // f(g()) -> g()가 먼저 연산되고, f()호출된다
        int sum2 = add(10, add(10,20)); //값처럼 다룬 것


        /*
        stack(main)---
        sum: 30 (리턴을 할때도, stack 값을 복사해서 가져간다)
        stack(main)---
        stack(add)---
        num1: 10
        num2: 20
        sum: 30
        stack(add)---
         */

        String name = "홍길동";
        // ~님으로 끝나나? endsWith("님")
        // addNim(name) -> "홍길동님" 문자열
        if (addNim(name).endsWith("님")) {
            System.out.println("님으로 끝납니다");
        };
        System.out.println(addNim(name).length());
    }
}
