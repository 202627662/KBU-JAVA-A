import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int COUNT = 10; // 공이 떨어지는 횟수

        double height, total;

        System.out.print("초기 높이 X(m)를 입력하세요: ");
        height = keyboard.nextDouble();

        total = 0.0;

        for (int i = 1; i <= COUNT; i++) {

            System.out.printf("공의 %d번째 낙하 높이: %.4f m\n", i, height);

            if (i == 1)
                total += height; // 처음에는 떨어지는 거리만
            else
                total += height * 2; // 튀어 오른 거리 + 다시 떨어진 거리

            height = height * 2 / 3; // 다음 높이는 2/3
        }

        System.out.printf("총 이동 거리: %.4f m\n", total);
    }
}
