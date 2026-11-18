import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int JUDGE = 7;                       // 채점관 수
        double[] score = new double[JUDGE];        // 채점관 점수 배열
        double sum = 0.0;
        double max, min, finalScore;
        int i;

        System.out.println("===== 체조 경기 채점 : 홍길동 선수 =====");

        i = 0;
        while (i < score.length) {                 // 점수 입력 (60.0 ~ 100.0)
            System.out.printf("%d번 채점관 점수 : ", i + 1);
            score[i] = keyboard.nextDouble();
            if (score[i] >= 60.0 && score[i] <= 100.0) {
                i++;
            } else {
                System.out.println(" ERROR 점수는 60.0점에서 100.0점 사이의 값");
            }
        }

        max = score[0];
        min = score[0];
        for (i = 0; i < score.length; i++) {       // 합계, 최고, 최소 점수
            sum += score[i];
            if (score[i] > max)
                max = score[i];
            if (score[i] < min)
                min = score[i];
        }

        finalScore = (sum - max - min) / (JUDGE - 2);   // 5명 평균

        System.out.println();
        System.out.println("---------------------------------------");
        for (i = 0; i < score.length; i++)
            System.out.printf("%d번 채점관 : %6.1f\n", i + 1, score[i]);
        System.out.println("---------------------------------------");
        System.out.printf("최고 점수 : %6.1f (제외)\n", max);
        System.out.printf("최소 점수 : %6.1f (제외)\n", min);
        System.out.printf("5명 점수 합계 : %6.1f\n", sum - max - min);
        System.out.printf("홍길동 선수의 최종 점수 : %.2f 점\n", finalScore);
    }
}
