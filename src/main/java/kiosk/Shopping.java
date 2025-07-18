package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

    private final List<MenuItem> shop = new ArrayList<>();

    // 생성자
    public void addShop(MenuItem menuItem) {
        shop.add(menuItem);
    }

    // 리스트 반환 메서드
    public List<MenuItem> getShop() {
        return shop;
    }

    // 리스트 나열 메서드
    public void viewShop() {
        for (MenuItem menuItem : shop) {
            System.out.println(menuItem);
        }
    }

    // 리스트에서 총 금액 계산해주는 메서드
    public double totalPrice() {
        // 금액 변수 초기화
        Double price = 0.0;
        // 목록에 있는 금액 합산
        for (MenuItem menuItem : shop) {
            price += menuItem.getPrice();
        }
        return price;
    }

    // 리스트 초기화 메서드
    public void clearShop() {
        shop.clear();
    }
}
