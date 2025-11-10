package _38_Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name; // 상품이름
    private  int stock; // 재고량
    private  boolean isOnSale; // 할인여부
    private  int price; // 상품가격
}
