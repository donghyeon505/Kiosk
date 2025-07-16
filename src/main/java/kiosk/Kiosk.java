package kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner sc = new Scanner(System.in);
    private final List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        // 메뉴 번호용 변수
        int menuNumber = 1;

        // 버거 메뉴 상단
        System.out.println("[ SHACKSHACK MENU ]");

        // 햄버거 메뉴
        for (MenuItem menuItem : menuItems) {
            System.out.println("[" + menuNumber + "]" + menuItem.getName() + "  |  " + menuItem.getPrice() + "  |  " + menuItem.getExplain());
            menuNumber++;
        }
        System.out.println("[0] 종료");

        // 기능 선택

        int featureNumber;
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
}
