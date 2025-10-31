package _27_Interface.doctor;

public class GeneralDoctor implements DoctorLicense{
    // 출력예시
    // 일반의가 환자를 진단합니다 : 홍길동
    // 일반의가 약을 처방합니다 : 감기약
    // 외과의가 환자를 진단합니다 : 홍길동
    // 외과의가 환자를 진단합니다 : 항생제

    @Override
    public void diagnose(String patient) {
        System.out.println("일반의가 환자를 진단합니다" + patient);
    }

    @Override
    public void prescribe(String medicene) {
        System.out.println("일반의가 약을 처방합니다 " + medicene );
    }


}
