package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

    private final List<MenuItem> shop = new ArrayList<>();

    public void addShop(MenuItem menuItem) {
        shop.add(menuItem);
    }

    public void viewShop() {
        for (MenuItem menuItem : shop) {
            System.out.println(menuItem);
        }
    }

    public List<MenuItem> getShop() {
        return shop;
    }
}
