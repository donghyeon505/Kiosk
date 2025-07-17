package kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner sc = new Scanner(System.in);
    private final List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    int menuNumber;
    int featureNumber;

    public void start() {
        // 선택한 메뉴 출력
        label:
        while (true) {
            System.out.println("[  SHACKSAHCK BURGER  ]");
            System.out.println("[1] Burgers");
            System.out.println("[2] Drink");
            System.out.println("[3] Side Menu");
            System.out.println("[0] 종료");

            // 기능 선택
            featureNumber = sc.nextInt();
            switch (featureNumber) {
                case 1:
                    hamburgerMenu();
                case 2:
                    drinkMenu();
                    break;
                case 3:
                    sideMenu();
                    break;
                case 0:
                    break label;
            }
        }
    }

    public void hamburgerMenu() {
        // 메뉴 번호용 변수
        menuNumber = 1;

        // 버거 메뉴 상단
        System.out.println("[  HamBurger Menu  ]");

        // 햄버거 메뉴
        for (MenuItem menuItem : menuItems) {
            System.out.println("[" + menuNumber + "]" + menuItem.getName() + "  |  " + menuItem.getPrice() + "  |  " + menuItem.getExplain());
            menuNumber++;
        }
        System.out.println("[0] 뒤로가기");

        // 기능 선택
        // 선택한 메뉴 출력
        while (true) {
            try {
                // 기능 입력 = 0 입력시 즉시 종료, 다른 값 입력시 메뉴를 같이 출력
                featureNumber = sc.nextInt();
                if (featureNumber == 0) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                } else if (featureNumber <= menuItems.size()) {
                    for (MenuItem menuItem : menuItems) {
                        // 인덱스와 기능 선택란의 숫자를 비교해서 해당 리스트만 반환
                        if (menuItems.indexOf(menuItem) == featureNumber - 1) {
                            System.out.println("선택한 메뉴 : " + menuItem.getName() + "  |  " + menuItem.getPrice() + "  |  " + menuItem.getExplain());
                        }
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }

        }
    }

    public void drinkMenu() {
        menuNumber = 1;
        System.out.println("[  Drink Menu  ]");
    }

    public void sideMenu() {
        menuNumber = 1;
        System.out.println("[  Side Menu  ]");
    }
}
