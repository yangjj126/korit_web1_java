package _03_Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자: 계산을 수행하는 기호
        // 3 + 4 // +가 연산자, 3,4 피연산자
        // a + b // "+" 가 연산자, a,b는 피연산자
         */

        // 산술연산자 ( +, -, *, /, % ) : 사칙연산
        int num1 = 1;
        int num2 = 2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);
        System.out.println(num1 % num2);

        // 나머지연산 - 1 / 2 -> 몫0 나머지1
        System.out.println(num1 % num2);

//        int even = 128;
//        // %2 를 했을때, 나머지가 있으면 -> 홀수
//        // 있으면 짝수
//        System.out.println(even1 % 2);



        //비교 연산자
//        System.out.println(num1 == num2); //같은 연산자
//        System.out.println(num1 != num2); //다른지 연산자
//        System.out.println(num1 > num2);
//        System.out.println(num1 < num2);




        //실습1) 오후 22시에서 50시간을 더하면 몇시인지 구하세요


                // 50나누기 24를 해서 몫과 나머지를 각각 구한다
                // 몫을 시간으로 한다



                int now = 22;
                int after50hour = now + (50 % 24); //괄호를 쳐주면, 우선 연산자가 된다
                System.out.println(after50hour);




        // 실습) x개의 게시물이 있다
        // 게시글은 한페이지당 20개씩 표시 된다
        // 이때 전체 페이지의 갯수를 구하세요
        // 어떻게 구할 수 있을지 설계해주세요
        // (x % 20) == 0 연산후의 결과가  true -> x / 20 이 총 페이지 수
        // 다음거는 너가 알아서 복습



        int postNumber = 1620;
        int pageNumber = 20;
        int total = postNumber / pageNumber;
        System.out.println(total);
    }
}
