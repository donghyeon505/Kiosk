package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 햄버거 메뉴
        List<MenuItem> burger = new ArrayList<>(List.of(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소그가 토핑된 치즈버거"),
                new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ));

        // 드링크 메뉴
        List<MenuItem> drink = new ArrayList<>(List.of(
                new MenuItem("Lemonade", 5.3, "매장에서 직접 만드는 상콤한 레몬에이드"),
                new MenuItem("IcedTea", 4.3, "직접 유기농 홍차를 우려낸 아이스티"),
                new MenuItem("FountainSoda", 3.8, "탄산음료 코카콜라, 스프라이트, 환타, 제로콜라"),
                new MenuItem("ShackCoffee", 3.9, "쉑 블렌드 원두를 사용한 밸런스 좋은 블랙 커피")
        ));

        // 사이드 메뉴
        List<MenuItem> sideMenu = new ArrayList<>(List.of(
                new MenuItem("Fries", 4.9, "바삭하고 담백한 크링클 컷 프라이"),
                new MenuItem("CheeseFires", 6.2, "고소하고 진한 치즈 소스를 듬뿍 올린 프라이"),
                new MenuItem("BlueCheeseFries", 6.2, "감칠맛과 크리미함이 매력적인 블루치즈 소스를 더한 바삭한 프라이"),
                new MenuItem("CherryPepperFries", 7.5, "고소하고 진한 치즈 소스와 매콤한 체리페퍼를 듬뿍 올린 프라이")
        ));

        // menus 리스트에 카테고리와 리스트 넣기
        List<Menu> menus = new ArrayList<>(List.of());
        menus.add(new Menu("Hamburger Menu", burger));
        menus.add(new Menu("Drink Menu", drink));
        menus.add(new Menu("Side Menu", sideMenu));

        // 키오스크 객체 생성
        Kiosk kiosk = new Kiosk(menus);

        // 키오스크 시작
        kiosk.start();
    }
}
