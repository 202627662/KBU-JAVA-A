import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구매 금액 입력 : ");
        int amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("오류: 구매 금액은 음수일 수 없습니다.");
        } else {
            System.out.print("멤버십 회원 여부 입력 (true/false) : ");
            boolean isMember = scanner.nextBoolean();

            boolean freeShipping = amount >= 50000
                    || (isMember && amount >= 30000);

            if (freeShipping) {
                System.out.println("무료배송 가능");
            } else {
                System.out.println("무료배송 불가");
            }
        }
    }
}