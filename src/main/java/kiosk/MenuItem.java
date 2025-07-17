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

    // 게터 메서드
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }
}
