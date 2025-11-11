package _38_Stream.student;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // https://www.notion.so/2698c3a0999580c08aa3ca2e503eac1e
        // List빨간색 = 컨트롤 스페이스바
        List<Student> students = List.of(
                new Student("김자바", "컴퓨터공학", 92, "010-1111-1111", "kim@secret.com"),
                new Student("이파이썬", "컴퓨터공학", 88, "010-2222-2222", "lee@secret.com"),
                new Student("박경영", "경영학", 76, "010-3333-3333", "park@secret.com"),
                new Student("최경영", "경영학", 84, "010-4444-4444", "choi@secret.com"),
                new Student("정노드", "컴퓨터공학", 91, "010-5555-5555", "jung@secret.com"),
                new Student("한삼성", "전자공학", 79, "010-6666-6666", "han@secret.com")
        );


        // 1. 90점이상 학생이 있는지 확인 - 최종결과 boolean타입을 출력
        // 2. 성적 상위 3명의 이름을 담은 리스트를 출력한다
        // 3. "컴퓨터공학과"이면서, 90점이상인 학생이름을 담은 리스트를 출력 // 정렬x
        // 4. "경영학" 전공인 학생들의 이메일들을 모은 리스트를 출력
        // 5.  학생들의 전공을 중복없이 추출해서 모은 리스트

        // 1번 알고리즘
    /*
     무조건 filter을 사용하고 그 조건이 점수가 90점이상인지를 판단해서 true인것을 출력해야 한다
     */
        boolean ninetyOverStudent = students.stream()
                .anyMatch((student -> student.getScore() >= 90));
        System.out.println(ninetyOverStudent);


        // 2번 알고리즘
        /*
        성적 상위 3명이면, 우선 점수를 다 뽑는다
         List<Integer> sortedDescNumbers = numbers.stream()
                .sorted((num1, num2) ->  num2 - num1)   //  양수, 0 ,음수 만 구현된다
                .collect(Collectors.toList());
        System.out.println(sortedNumbers); 이거 이용해야해
         */

        // 정렬 -> limit -> 객체에서 문자열 변환 -> 모으기

        List<String> top3Names = students.stream()
                .sorted((st1, st2) -> st2.getScore() - st1.getScore()) // 우선, 내림차순으로 매개변수로 학생을 받고, 점수를 출력시킴
                .limit(3) // 3명으로 제한
                .map(student -> student.getName()) // [ 객체1, 객체2 ... ] -> [이름1, 이름2 ... ]
                .collect(Collectors.toList());
        System.out.println(top3Names);
        // 3변 알고리즘
        /*
        필터링 -> 객체에서 문자열 반환 -> 모으기
         */
        List<String> results = students.stream()
                .filter(student -> student.getMajor().equals("컴퓨터공학") &&
                        student.getScore() >= 90)
                .map(student -> student.getName()) //순서는 바뀌면 안된다
                .collect(Collectors.toList());
        System.out.println(results);


        // 4. "경영학" 전공인 학생들의 이메일들을 모은 리스트를 출력
        /*
        알고리즘 :
         */
        List<String> econom = students.stream()
                .filter(student -> student.getMajor().equals("경영학"))
                .map(student -> student.getEmail())
                .collect(Collectors.toList());

        System.out.println(econom);


        // 학생들의 전공을 중복없이 추출해서 모은 리스트
        // distinct -> 객체상태로 distinct()를 적용하면, equals(), hashcode()로 비교
        List<String> majors = students.stream()
                .map(student -> student.getMajor()) // 전공빼고 다날라간 상태
                .distinct() // 문자열에 distinct()를 적용
                .collect(Collectors.toList());
        System.out.println(majors);


        // 4. 실무에서 가장 많이 하는 dto변환 -- 나중에
        // entity(Student) -> dto(StudentDto)
        List<StudentDto> dtos = students.stream()
                .map(student -> student.toDto())
                .collect(Collectors.toList());

        List<StudentDto> dtos = students.stream()
                .map(student -> student.toDto())
                .collect(Collectors.toList());
        //나머지 다 작성해라....
    }
}
