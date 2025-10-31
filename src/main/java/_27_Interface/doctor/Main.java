package _27_Interface.doctor;

public class Main {
    public static void main(String[] args) {
        DoctorLicense doc1 = new GeneralDoctor(); //캐스팅
        DoctorLicense doc2 = new Surgeon(); //캐스팅

        String patient = "홍길동";


        DoctorLicense[] doctors = {doc1, doc2};
        // 출력예시
        // 일반의가 환자를 진단합니다 : 홍길동
        // 일반의가 약을 처방합니다 : 감기약
        // 외과의가 환자를 진단합니다 : 홍길동
        // 외과의가 환자를 진단합니다 : 항생제

        // 다형성 : 같은 코드인데, 같은 타입인데, 객체가 서로 다르게 행동한다
        // -> for문 수정을 안해도 된다...................................!
        // 부모에 메서드가 이미 있으니까 괜찮은것 같다

        String[] medicines = {"감기약", "항생재"};
        int i = 0;


        for (DoctorLicense doc : doctors){ //DoctorLicence가 가지고 있는 메서드겠다 아래는
            doc.diagnose(patient);
            doc.prescribe(medicines[i]); // medicen을 처음에는 감기약으로, 그다음것은 항생재로
            i++;                         // 이게 커스텀이다,,,
        }
    }
}
