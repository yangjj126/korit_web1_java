package _15_Method;

public class Parameter {
    //매개변수: 코드를 재사용할때, 변수 부분을 외부로부터 받아오는 변수
    //메게변수는 함수 안에서만 생존한다
    //정의 할때, 함수명(자료형, 매개변수명)
    //String name -> 외부로부터 String 데이터를 받아와서
    //함수안에서
    public static  void greeting(String name){
        System.out.println("안녕하세요" + name + "님!");
    }

    public static void printAddNum(int num1, int num2) {
    int a = 10;
    int b = 20;
    printAddNum(a, b);
    /*
    메모리에 존재하는 stack공간
    함수 호출로 생성된다, 함수별로 공간을 가지고 있다
    - 현재 stack -
    stack(main)------
    a : 10
    b : 20
    stack(main)------
    stack(printAddNum)---
    num1 : 10
    num2 : 20
    sum :
    stack(printAddNum)---
     */
    }

    public static void main(String[] args) {
       String name = "홍길동";
       greeting(name); //매개변수의 자료형만 맞춰주면 된다
       //main의 name변수와 greeting의 name변수와는 다르다
       //메모리주소가 다르다
        /*
        메모리에 존재하는 stack공간 :
        함수 호출로 생성된다, 함수별로 공간을 가지고 있다
         */
    }
}
