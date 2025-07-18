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

            // 메뉴 번호용 변수
            int MenuNumber = 0;

            // 메뉴 상단
            System.out.println("[  SHACKSHACK Burger  ]");

            // 메뉴 출력
            for (int i = 0; i < allMenus.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + allMenus.get(i).getCategory());
                MenuNumber = i + 1;
            }

            // 메뉴 하단
            System.out.println("[0] 종료");

            // 메뉴 추가시 나오는 Order Menu
            List<MenuItem> shoppingList = shopping.getShop();
            if (!shoppingList.isEmpty()) {
                System.out.println("\n[  Order Menu  ]");
                System.out.println("[" + (MenuNumber + 1) + "] Orders  | 장바구니를 확인 후 주문합니다.");
                System.out.println("[" + (MenuNumber + 2) + "] Cancel  | 진행중인 주문을 취소합니다.");
            }

            // 입력 오류 처리
            try {

                // 메뉴 번호 입력
                featureNumber = sc.nextInt();

                // 기능 구분
                if (featureNumber >= 1 && featureNumber <= allMenus.size()) {
                    viewMenu();
                } else if (featureNumber == 0) {
                    break;
                } else if (!shoppingList.isEmpty() && featureNumber == MenuNumber + 1) {
                    order();
                } else if (!shoppingList.isEmpty() && featureNumber == MenuNumber + 2) {
                    shopping.clearShop();
                    System.out.println("취소되었습니다\n");
                } else {
                    System.out.println("\n잘못된 입력입니다.\n");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }
        }
    }

    public void viewMenu() {

        // 번호에 따라 해당 메뉴의 리스트 출력
            Menu select = allMenus.get(featureNumber - 1);
            System.out.println("\n[  " + select.getCategory() + "  ]");
            select.printMenu();

            int selectNumber = sc.nextInt();
            if (selectNumber == 0) {
                System.out.println("뒤로가기\n");
            }

            // 선택한 메뉴
            if (selectNumber >= 1 && selectNumber <= allMenus.size()) {
                MenuItem selectMenu = select.getMenu(selectNumber - 1);
                System.out.println("\n선택한 메뉴: " + selectMenu);

                // 메뉴 추가 여부
                System.out.println("위 메뉴를 추가 하시겠습니까?");
                System.out.println("1.추가          2.취소");
                    int orderNumber = sc.nextInt();
                    if (orderNumber == 1) {
                        System.out.println("\n" + selectMenu.getName() + "이 장바구니에 추가되었습니다.\n");
                        shopping.addShop(selectMenu);
                    } else if (orderNumber == 2) {
                        System.out.println("취소되었습니다.");
                    }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    public void order() {
        // Order 메뉴 시작
        System.out.println("\n아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[  Orders  ]");

        // 목록
        shopping.viewShop();

        System.out.println("\n[  Total  ]");

        // 총 금액
        shopping.totalPrice();

        // 입력
        System.out.println("\n\n1.주문        2.메뉴판");
        int orderNumber = sc.nextInt();

        // 입력 구분
        if (orderNumber == 1) {
            System.out.print("\n주문이 완료되었습니다. 금액은 ");
            shopping.totalPrice();
            System.out.println(" 입니다.\n");
            shopping.clearShop();
        } else  if (orderNumber == 2) {
            System.out.println("메뉴판으로 이동합니다.\n");
        } else {
            System.out.println("잘못된 입력입니다.\n");
        }
    }
}


