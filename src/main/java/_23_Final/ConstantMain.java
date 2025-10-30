package _23_Final;

public class ConstantMain {
    public static void main(String[] args) {

        // 매직넘버, 매직스트링 : 하드코딩되어있는 숫자, 문자열
        // 나중에 10년뒤에 코드를 봤을때, "이 숫자가 뭐더라?"라고 궁금해 하시면,
        // 매직넘버, 매직 스트링이다

        System.out.println("게임명 : " + Constant.GAME_NAME);
        System.out.println("게임모드: " + Constant.BATTLE_MODE);
        System.out.println("플레이어수: " + Constant.MAX_PLAYER_COUNT);

        int playerLevel = 18; // 사용자가 입력한 값

        // 레벨업 로직
        if (playerLevel + 1 >  Constant.MAX_LEVEL) {
            // 지금 다시 보았을때는, 확실히 어떤 의미인지를 알겠다 (MAX_LEVEL)
            System.out.println("이미 최대 레벨에 도달했습니다");
        } else {
            playerLevel++;
        }

        // 물건 구입 - 금액에 따라서 할인
        // 5만원 넘어가면, 10% 할인

        int price = 100000;
        double discountPrice = 0.0;
        if (price > Constant.DISCOUNT_THRESHOLD){
            double discountAmount = price * Constant.DISCOUNT_RATE;
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }

        // 50000원과 0.1은 매직넘버
    }
}
