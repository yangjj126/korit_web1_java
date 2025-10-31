package _25_Casting.delivery;

public class Delivery {
    protected int distance; // 배송거리
    protected int weight; // 배송물무게

    public Delivery(int distance, int weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public int calcFee() {
        return 3000;
    }
    // 우리는 굳이 부모클래스의 retrurn 3000이 필요하지 않다 => 이제는 "추상화"를 배울 단꼐


    public void printInfo() {
        int fee = calcFee();
        System.out.println("배송비: " + fee);
    }
}
