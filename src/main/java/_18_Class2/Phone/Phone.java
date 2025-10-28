package _18_Class2.Phone;

public class Phone {
    int battery;
    boolean isPowerOn;

    // turnOn: 전원켜기(배터리가 10%이상일때만, 가능하다)
    // void는 리턴값이 없는 단수 실행함수
    void turnOn() {
        if (this.battery < 10){
            System.out.println("배터리가 부족합니다. 전원을 켤 수 없습니다");
            return;
        }

        this.isPowerOn = true;
        System.out.println("핸드폰 전원을 켭니다");
    }




    //전원끄기
    void turnOff() {
        if (!this.isPowerOn){
            System.out.println("이미 전원이 꺼져있습니다");
            return;
        }

        // 만약, isPoweron이 참이라면, if문을 들어가지 않고,
        // if문 밖으로 나와서, isPowerOn과 sout이 출력된다...
        // 무조건 this를 붙여야한다
        this.isPowerOn = false;
        System.out.println("전원을 끕니다");
    }





    // 유튜브 시청하기
    // 전원이 켜져있고, 배터리가 5퍼센트 이상일때만 가능하다, 배터리 5퍼센트 소모
    // 이것같은 경우에는, 안되는 경우부터 시작해서 마지막에 예외사항을 처리하는 식으로 가자

    void playYoutube() {
        if (!this.isPowerOn) {
            System.out.println("전원이 켜져있지 않습니다");
        }

        if (this.battery < 5){
            System.out.println("배터리가 5프로 이하이므로, 자동꺼짐 합니다");
        }

        battery -= 5;
        System.out.println("유튜브 시청이 가능합니다");
    }



    // 충전하기 (20% 충전, 최대 100% 충전 가능)
    void charge() {
        this.battery += 20;
        if (this.battery > 100){
            battery = 100;
        }
        System.out.println("배터리를 모두 다 충전했습니다");
    }
}


























//
//    void turnOn(){               === 내가 한것
//        if (battery > 10){
//            System.out.println("전원켜기");
//            isPowerOn = true;
//        }
//    }
//    void turnOff() {
//        if (battery <= 10){
//            System.out.println("전원꺼짐");
//            isPowerOn = false;
//        }
//    }
//
//    void playYoutube(){
//        if (isPowerOn && battery > 20){
//            playYoutube = true;
//            battery -=5;
//        } else {
//            playYoutube = false;
//        }
//    }


