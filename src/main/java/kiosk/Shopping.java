package kiosk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shopping {

    private List<MenuItem> shop = new ArrayList<>();
    private List<MenuItem> removeList = new ArrayList<>();
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
        Map<MenuItem, Integer> shopMap = new HashMap<>();

        for (MenuItem menuItem : shop) {
            shopMap.put(menuItem, shopMap.getOrDefault(menuItem, 0) + 1);
        }

        for (Map.Entry<MenuItem, Integer> entry : shopMap.entrySet()) {
            System.out.println(entry.getKey() + " | 수량 : " + entry.getValue());
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

    // 중복제거된 리스트 나열 메서드
    public void removeShopList() {
        removeList = shop.stream()
                .distinct()
                .toList();

        for (int i = 0; i < removeList.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + removeList.get(i));
        }
    }

    // 메뉴 빼기 메서드
    public void removeShop (int select) {
        MenuItem remove = removeList.get(select - 1);

        shop = shop.stream()
                .filter(item -> !item.equals(remove))
                .toList();
    }

    // 리스트 초기화 메서드
    public void clearShop() {
        shop.clear();
    }
}
