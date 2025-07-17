package kiosk;

public class MenuItem {

    private final String name;
    private final String price;
    private final String explain;

    // 생성자
    public MenuItem(String name, String price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + explain;
    }
}
