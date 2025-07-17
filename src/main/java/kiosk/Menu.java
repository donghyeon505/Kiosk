package kiosk;

import java.util.List;

public class Menu {

    private final List<MenuItem> drinkMenu;
    private final List<MenuItem> hamburgerMenu;
    private final List<MenuItem> sideMenu;

    public Menu(List<MenuItem> hamburgerMenu, List<MenuItem> drinkMenu, List<MenuItem> sideMenu) {
        this.hamburgerMenu = hamburgerMenu;
        this.drinkMenu = drinkMenu;
        this.sideMenu = sideMenu;
    }
}
