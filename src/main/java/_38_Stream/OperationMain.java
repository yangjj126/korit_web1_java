package _38_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationMain {
    public static void main(String[] args) {
        // Stream에서 중간 연산자, 최종 연산자
        // 중간 연산자
        // 1. filter
        // 2. map
        // 3. distinct() , limit()

        // 4. sorted() - 정렬
        // Comparator<T> 함수형 인터페이스를 매개변수로 받는다.
        // Comparator<T> compare (T o1, T o2)
        // O1과 O2를 비교
        // O1과 O2가 같으면, 0으로 구현
        // O1이 크면, 양수가 되도록 구현
        // O1이 작으면, 음수가 되도록 구현
        List<String> names = Arrays.asList("감자바", "이파이썬", "박스프링",
                "최고틀린", "정리엑트", "김자바");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,10,9,8);

        // 숫자 정렬
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((num1, num2) -> num1 - num2)   //  양수, 0 ,음수 만 구현된다
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // 문자(문자열) 정렬
        // 문자는 숫자로 전환할 수 있다
        // a b
        // ( 사전에서 뒤에 출현하는 문자가 더 큰 숫자 )
        // 문자열1.compareTo(문자열2) //문자열1 - 문자열2\
        List<String> sortedNames = names.stream()
                .sorted((str1, str2)-> str1.compareTo(str2))
                .collect(Collectors.toList());

        System.out.println(sortedNames);

        // 역순으로 하는 경우
        // 슷자를 내림차순
        // 문자열도 사전역순으로


        List<Integer> sortedDescNumbers = numbers.stream()
                .sorted((num1, num2) ->  num2 - num1)   //  양수, 0 ,음수 만 구현된다
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List<String> sortedDescNames = names.stream()
                .sorted((str1, str2)-> str2.compareTo(str1))
                .collect(Collectors.toList());
        System.out.println(sortedDescNames);


        // 최종연산자
        // 1. collect()
        // 2. forEach()
        // 3. 조건매칭 - anyMatch(), allMatch(), noneMatch()
        // Predicate<T> 를 매개변수로 받는다
        // 리턴은 불리언

        boolean hasKim = names.stream()
                .anyMatch(name -> name.startsWith("김")); //Predicate
        // 결과가 하나라도 트루이면, 트루가 나온다

        boolean isOver2Name = names.stream()
                .allMatch(name -> name.length() >= 2);
        // 결과가 모두 true여야 true값이 나온다냥

        // 위에 두가지를 주로 사용한다 //-----


        // 4.통계 연산 - count() , min() , max()

        long size = names.stream()
                .filter((name -> name.startsWith("감")))
                .count();

        // max() - Comparator<T>를 매개변수로 받는다
        String longestName = names.stream()
                .max((name1, name2) -> name1.compareTo(name2))
                .orElse("없음");

        Integer maxValue = numbers.stream()
                .max((num1, num2)-> num1 - num2)
                .orElse(0);

        // 추가) Optional ?
        // 값이 존재할 수 도 있고, 없을 수도 있는 상황에서 사용
        // 변수를 필드로 가지는 컨테이너 클래스 -> null로 인한 예외


        // 5. reduce()
        // numbers에 있는 모든값의 총합을 구해보자!
        // reduce(초기값, (누적시킬 변수 선언, 순회시킬 변수 선언) -> 연산식 )
        // stream은 외부변수를 사용할 수 없음(final만 가능)
        // 누적합 sum += num 코드를 사용할 수 없음..
        // 시발 어지럽다..

        int total = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);
        // for문 -> 향상for문 -> 지금 배우는것
//
//        int sum = 0;
//        for (int num : nums) {
//            sum = sum +num;
//        }
//
//        System.out.println(sum);
        System.out.println(total);
    }
}
