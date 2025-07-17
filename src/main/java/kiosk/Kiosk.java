package kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner sc = new Scanner(System.in);
    private final List<Menu> allMenus;

    private int featureNumber;

    public Kiosk(List<Menu> allMenu) {
        this.allMenus = allMenu;
    }

    public void start() {
        // 선택한 메뉴 출력
        while (true) {
            // 메뉴판
                System.out.println("[  SHACKSHACK Burger  ]");
                for (int i = 0; i < allMenus.size(); i++) {
                    System.out.println("[" + (i + 1) + "] " + allMenus.get(i).getCategory());
                }
                System.out.println("[0] 종료");

            try {
                featureNumber = sc.nextInt();

                if (featureNumber == 0) {
                    System.out.println("종료합니다");
                    break;
                }
                viewMenu();
            } catch(Exception e) {
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
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
