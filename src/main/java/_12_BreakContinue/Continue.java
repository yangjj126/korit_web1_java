package _12_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // continue - 반복문 내에서 코드 진행을 멈추고, 다음 반복으로 넘어감
        // 사실상 스킵!
        for (int i = 1; i <= 50; i++) {
            // 짝수만 출력하겠다
            if (i % 2 != 0) {       // 홀수 조건
                continue; //if 문에 걸리지 않을 경우 (짝수조건) // 이경우 다시 한 번 더 보기
            }
            System.out.println(i); // if 문에 걸리지 않을 경우 (짝수조건)
        }


        int waiting = 50; //대기
        int stock = 10; //재고량
        int noShowIndex = 6; //노쇼번호
        int sold = 0; // 실시간 판매량

        for (int i = 1; i<= waiting; i++){
            System.out.println(i + "번째 손님 입장하세요");

            if (i == noShowIndex) {
                System.out.println(i + "번쩨 손님???");
                continue;
            }

            sold++; //위에 if문 덕분에 노쇼가 아니면, 1증가 (판매 처리)

            if (stock == waiting) {  // 재고량만큼의 실제 판매량이 일치하면
                System.out.println("재료 소진");
                break;
            }
        }
    }
}
