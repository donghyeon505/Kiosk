package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 메뉴 객체 생성
        MenuItem firstMenu = new MenuItem(" ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem secondMenu = new MenuItem(" SmokeBurger", "W 8.9", "베이컨, 체리 페퍼에 쉑소그가 토핑된 치즈버거");
        MenuItem thirdMenu = new MenuItem(" CheeseBurger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem fourthMenu = new MenuItem(" HamBurger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(firstMenu);
        menuItems.add(secondMenu);
        menuItems.add(thirdMenu);
        menuItems.add(fourthMenu);

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
