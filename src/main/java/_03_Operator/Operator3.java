package _03_Operator;

public class Operator3 {
    public static void main(String[] args) {
        //논리 연산자 - boolean 자료끼리 연산
        //결과타입 : boolean타입
        boolean hasLicense = true;
        int age = 25;
        // and 연산자(&&) : 둘다 참일때만, true
        boolean canDrive = (age >= 20 ) && hasLicense;

        // or 연산자(||) : 둘중하나라도 참이면 참(or)
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestDay = isWeekend || isHoliday;

        // not연산자(!) : 참을 거짓으로, 거짓을 참으로(not)
        boolean isOnline = true;
        boolean isOffline = !isOnline;

    }
}
