package kiosk;

public enum Discount {
    patriot(1,0.9),
    soldier(2,0.95),
    student(3,0.97),
    general(4,1);

    private final int type;
    private final double discount;

    // 생성자
    Discount(int type, double discount) {
        this.type = type;
        this.discount = discount;
    }

    // 타입 가져오기
    public int getType() {
        return type;
    }

    // 할인율 가져오기
    public double getDiscount() {
        return discount;
    }

    // 타입 비교
    public static Discount getDiscount(int type) {
        for (Discount discount : Discount.values()) {
            if (discount.getType() == type) {
                return discount;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 타입입니다.");
    }

    // 할인정보 메뉴 출력
    public static void getTypeList() {
        for (int i = 0; i + 1 <= Discount.values().length; i++) {
            System.out.println("[" + (i + 1)+ "] " + Discount.values()[i] + "  :  " +  (100 - Discount.values()[i].getDiscount() * 100) + "%");
        }
    }
}
