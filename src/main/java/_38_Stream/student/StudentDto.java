package _38_Stream.student;

// entity - 데이터베이스에 있는 테이블데이터를 그대로 가져온 것

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// dto( data transfer object ) - 화면에 보여줄 데이터 객체
// 1. 민감정보를 숨기고, 필요한 것만 보여준다
// 2. 가공한 정보를 보여준다
// entity -> dto ( 자바 즉, 백엔드에서 이것을 가장 많이 한다 )
@Data
@AllArgsConstructor
@Builder
public class StudentDto {
    private  String name;
    private  String major;
    private  String grade;
}
