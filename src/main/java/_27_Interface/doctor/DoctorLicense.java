package _27_Interface.doctor;
// 시그니처를 변수범위까지 잘 설정해두어야 한다..
public interface DoctorLicense {
    void diagnose(String patient);
    void prescribe(String medicine);
}
