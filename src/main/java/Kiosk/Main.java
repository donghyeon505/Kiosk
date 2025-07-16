package Kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 메뉴 출력 (하드코딩)
        System.out.println("[ SHACKSHACK MENU ]");
        System.out.println("[1] ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("[2] SmokeBurger    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("[3] CheeseBurger   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("[4] HamBurger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("[0] 종료");

        String featureNumber = sc.nextLine();

        // 메뉴 선택 부분 (하드코딩)
        switch (featureNumber) {
            case "1":
                System.out.println("\n선택한 메뉴 :  ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                break;
            case "2":
                System.out.println("\n선택한 메뉴 :  SmokeBurger    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                break;
            case "3":
                System.out.println("\n선택한 메뉴 :  CheeseBurger   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                break;
            case "4":
                System.out.println("\n선택한 메뉴 :  HamBurger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                break;
            case "0":
                System.out.println("\n프로그램을 종료합니다.");
                break;
            default:
                System.out.println("\n잘못된 입력입니다.");
        }
    }
}
