package kiosk;

import java.util.List;

public class Menu {

    private final List<MenuItem> drinkMenu;
    private final List<MenuItem> hamburgerMenu;
    private final List<MenuItem> sideMenu;

    // 생성자
    public Menu(List<MenuItem> hamburgerMenu, List<MenuItem> drinkMenu, List<MenuItem> sideMenu) {
        this.hamburgerMenu = hamburgerMenu;
        this.drinkMenu = drinkMenu;
        this.sideMenu = sideMenu;
    }

    // 햄버거 메뉴 getter
    public List<MenuItem> getHamburgerMenu() {
        return hamburgerMenu;
    }

    // 드링크 메뉴 게터
    public List<MenuItem> getDrinkMenu() {
        return drinkMenu;
    }

    // 사이드 메뉴 getter
    public List<MenuItem> getSideMenu() {
        return sideMenu;
    }
}
