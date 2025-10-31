package _27_Interface.doctor;

public class Surgeon implements DoctorLicense{
    @Override
    public void diagenose(String patient) {
        System.out.println("외과의가 환자를 진단합니다" + patient);
    }

    @Override
    public void prescribe(String medicine) {
        System.out.println("외과의가 약을 처방합니다" + medicine);
    }
}
