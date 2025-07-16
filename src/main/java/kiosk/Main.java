package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 메뉴 객체 생성
        MenuItem firstMenu = new MenuItem(" ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem secondMenu = new MenuItem(" SmokeBurger", "W 8.9", "베이컨, 체리 페퍼에 쉑소그가 토핑된 치즈버거");
        MenuItem thirdMenu = new MenuItem(" CheeseBurger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem fourthMenu = new MenuItem(" HamBurger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(firstMenu);
        menuItems.add(secondMenu);
        menuItems.add(thirdMenu);
        menuItems.add(fourthMenu);

        Kiosk kiosk = new Kiosk(menuItems);

        kiosk.start();
    }
}
