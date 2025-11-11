package _38_Stream.student;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String major;
    private int score;
    private String phoneNumber;
    private String email;

    // ***dto로 변환하는 메서드를 정의**** -- 이게 데이터를 가공하는것이라고 볼수 있다 ( grade를 추가해주는 것 나머지는 없애고 )
    public StudentDto toDto() {
        String grade;
        if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else grade = "F";

        return new StudentDto(name, major, grade);
    }

    // dto2로 변환하는 인스턴스 메서드
    public StudentDto2 dto2() {
        // 내부에서 email에서 Id만 추출해주는 코드 작성
        int indexOfAt = this.email.indexOf("@"); // aaaaaa@bbbbb.com
        String emailId = this.email.substring(0, indexOfAt);

        return new StudentDto2(name, major, score, emailId);
    }
}
