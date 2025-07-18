package kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner sc = new Scanner(System.in);
    private final Shopping shopping = new Shopping();
    private final List<Menu> allMenus;

    private int featureNumber;

    public Kiosk(List<Menu> allMenu) {
        this.allMenus = allMenu;
    }

    public void start() {
        // 선택한 메뉴 출력
        while (true) {
            // 메뉴판 번호용 변수
            int MenuNumber = 0;

            // 메뉴 상단
            System.out.println("[  SHACKSHACK Burger  ]");

            // 메뉴 출력
            for (int i = 0; i < allMenus.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + allMenus.get(i).getCategory());
                MenuNumber = i + 1;
            }

            // 메뉴 하단
            System.out.println("[0] 종료\n");

            // 메뉴 선택시 나오는 Order Menu
            List<MenuItem> shoppingList = shopping.getShop();
            if (!shoppingList.isEmpty()) {
                System.out.println("[  Order Menu  ]");
                System.out.println("[" + (MenuNumber + 1) + "] Orders  | 장바구니를 확인 후 주문합니다.");
                System.out.println("[" + (MenuNumber + 2) + "] Cancel  | 진행중인 주문을 취소합니다.");
            }

            try {
                featureNumber = sc.nextInt();

                if (featureNumber == 0) {
                    System.out.println("종료합니다");
                    break;
                }
                viewMenu();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }
        }
    }

    public void viewMenu() {
        if (featureNumber >= 1 && featureNumber <= allMenus.size()) {
            Menu select = allMenus.get(featureNumber - 1);
            System.out.println("[  " + select.getCategory() + "  ]");
            select.printMenu();

            int selectNumber = sc.nextInt();
            if (selectNumber == 0) {
                System.out.println("뒤로가기\n");
            }

            if (selectNumber >= 1 && selectNumber <= allMenus.size()) {
                MenuItem selectMenu = select.getMenu(selectNumber - 1);
                System.out.println("선택한 메뉴: " + selectMenu + "\n");
                shopping.addShop(selectMenu);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
