package _18_Java2.Phone;

public class Phone {
        /* 실습
        Phone 클래스를 정의
        필드 : battery(int), isPowerOn(boolean)
        메서드 :
        turnOn : 전원 켜기 (배터리가 10퍼이상일때만 가능)
        turnOff : 전원 끄기
        playYoutube : 전원이 켜져있고, 배터리가 20%이상일때만 가능, 배터리 5%소모
        charge : 충전하기(20%충전, 최대 100%)
         */


    int battery;
    boolean isPowerOn;

// 캡슐화 과정)

    void turnOn() {
        if (battery < 10){
            System.out.println("배터리가 부족합니다. 전원을 켤 수 없습니다");
            return;
        }
        // 어차피 else가 오든 안오든 아래껄로 진행 배터리가 10보다 작으면은
        isPowerOn = true;
        System.out.println("핸드폰 전원을 켭니다");
    }

    //전원끄기
    void turnOff() {
        if (!isPowerOn){
            System.out.println("이미 전원이 꺼져있습니다");
            return;
        }

        isPowerOn = false;
        System.out.println("전원을 끕니다");
    }


    //전원이 켜져있고, 배터리가 5퍼센트 이상일때만 가능하다, 배터리 5퍼센트 소모
    void playYoutube(){
        if (!isPowerOn){
        System.out.println("전원을 먼저 꺼주세요");
        return;}
        if (vattery < 5){
            System.out.println("배터리가 부족합니다(최소5프로 필요)");
            return;
        }


        /// 여기 다 못적음



        //충전하기(20프로 충전, 최대100프로)
        vois charge(){
            battery += 20;
            if (battery > 100) {
                battery = 100;
            }
            System.out.println("배터리를 충전했습니다");
        }
    }





    // 간단하게 고치기









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

}
