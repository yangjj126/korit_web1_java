package _03_Operator;

public class Operator5 {
    public static void main(String[] args) {
        // 삼항연산자 ( 피연산자가 3개다)
        int x = 5;
        int y = 3;
        // boolean데이터 ? true일때 값 : false일때 값
        int max = x > y ? x : y;
        boolean isSame = x == y ? true : false;
        // 삼항연산자가 조건문과 다른점 : 결과가 값이다..
        String sameStr = x == y ? "같음" : "다름";

        //중첩도 가능하다
        int age = 17;
        String ticketName = age >= 19 ? "성인요금"  // 조건 ? true 데이터
                            : age >= 14 ? "청소년 요금"  // 조건 ? true 데이터
                            : "어린이 요금"; // 모든 조건 충족이 안될때


        //실습1) 키가 120이상인 경우에만 탑승가능하도록 하는 삼항연산자
        //탑승가능 한 경우 "탑승가능" 아니면 "탑승불가능"

        int height = 110;
        String canRide = height >= 120 ? "탑승가능" : "탑승 불가능";
        System.out.println(canRide);

        //실습2)  페이지네이션
        //게시글이 162개가 있고, 한페이지에 20개씩 화면에 보인다면,
        //총페이지의 개수를 구하시요

        int postCard = 162;
        int pageCount; //총페이지 출력

        pageCount = postCard % 20 == 0
                    ? postCard/20  //떨어지면, 몫을 대입
                    : (postCard/20) + 1; //떨어지지않으면, 몫 + 1
        System.out.println(pageCount);

        //git add. -> git commit -m"메시지" -> git push 하면 깃에 저잗됨
    }
}
