import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 정수 입력: ");
        int b = scanner.nextInt();

        System.out.print("세 번째 정수 입력: ");
        int c = scanner.nextInt();

        boolean allPositive = a > 0 && b > 0 && c > 0;
        boolean hasNegative = a < 0 || b < 0 || c < 0;
        boolean allZero = a == 0 && b == 0 && c == 0;

        if (allPositive) {
            System.out.println("모두 양수");
        } else if (hasNegative) {
            System.out.println("음수 포함");
        } else if (allZero) {
            System.out.println("모두 0");
        } else if (!hasNegative) {
            System.out.println("0과 양수 포함");
        }

    }
}