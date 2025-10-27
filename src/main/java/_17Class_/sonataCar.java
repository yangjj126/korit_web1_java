package _17Class_;

public class sonataCar {
    public static void main(String[] args) {

    //인스턴스는 항상 main안쪽에다가 적어줘야한다 ( 이안에서 출력도 같이 할 꺼니깐 )
     Car sonata = new Car();
     sonata.brand = "현대";
     sonata.modelName = "소나타";
     sonata.year = 2023;

     System.out.println(sonata.brand + "-" + sonata.modelName + "-" + sonata.year);
     // 빼기 부분은 string이니깐, "-"이렇게 적어주기
    }
}
