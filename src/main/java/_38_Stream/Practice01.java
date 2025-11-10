package _38_Stream;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice01 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                    new Item("노트북", 5, false, 10000000),
                    new Item("마우스", 0, true, 100),
                    new Item("마나우스", 10, false, 600),
                    new Item("헤드셋", 3, true, 600),
                    new Item("리모컨", 1, true, 700)
        );

        // Item 객체들에서 이름들만 뽑아내기 List
        List<String> itemNames = items.stream()
                .map(item -> item.getName())
                .collect(Collectors.toList());
        System.out.println(itemNames);

        // 1. 가격들만 뽑아서, 평균가격 출력
        // 2. 재고들의 총가격을 출력

        // Stream에서는 외부변수 사용이 제한된다 (final 사용 가능)
        // reduce 최종연산자를 사용해야한다

        // 1. 가격들만 뽑아서, 평균


        // 2. 각 재고들의 총가격 출력 ( 리턴x  -> forEach )

        items.stream()
                .forEach( item ->{
                    int stock = item.getStock();
                    int price = item.getPrice();
                    System.out.println(stock * price);
                });



        // 3. 재고가 1개 이상이면서, 세일중인 items들의 리스트를 구해라
//        String[] conditionItems = items.stream()
//                .filter(item -> item.getStock() > 1 && item.isOnSale())
//                .collect(Collectors.toList());
//        System.out.println(Arrays.toString(conditionItems));
// 내갛나거


        // 3. 재고가 1개 이상이면서, 세일중인 items들의 리스트를 구해라
        List<Item> filteredItems = items.stream() //ListItem은 무슨뜻인걸까....
                .filter(item -> item.getStock() > 0 && item.isOnSale() )
                .collect(Collectors.toList());

        System.out.println(filteredItems);
    }
}
