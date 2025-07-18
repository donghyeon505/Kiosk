package kiosk;

import java.util.List;

public class Menu {

    private final List<MenuItem> allMenus;
    private final String category;

    // 생성자
    public Menu(String Category, List<MenuItem> allMenus) {
        this.category = Category;
        this.allMenus = allMenus;
    }

    // 해당 메뉴 출력 (index는 select Number -1) 메서드
    public MenuItem getMenu(int index) {
        if (index >= 0 && index < allMenus.size()) {
            return allMenus.get(index);
        }
        return null;
    }

    // 해당 카테고리의 메뉴들 출력 메서드
    public void printMenu() {
        for (int i = 0; i < allMenus.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + allMenus.get(i));
        }
        System.out.println("[0] 뒤로가기");
    }

    // 카테고리 이름 불러오는 메서드
    public String getCategory() {
        return category;
    }

}
