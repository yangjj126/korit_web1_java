package _25_Casting.delivery;

public class Fast extends delivery {
    public Fast(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public int calcFee(){
        System.out.println("특급배송 시작");
        int fee = 4000 + distance * 300; //나머지 못적음
    }
}
