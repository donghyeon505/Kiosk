package kiosk;

public class MenuItem {

    private final String name;
    private final Double price;
    private final String explain;

    // 생성자
    public MenuItem(String name, Double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

    @Override
    public String toString() {
        return name + " | W " + price + " | " + explain;
    }
}
