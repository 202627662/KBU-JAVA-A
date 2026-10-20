import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("0부터 100까지의 점수를 입력하세요.");
        } else {
            String grade;

            if (score >= 95) {
                grade = "A+";
            } else if (score >= 60) {
                char letter = (char) ('A' + (9 - score / 10));
                String sign = score % 10 >= 5 ? "+" : "0";

                grade = "" + letter + sign;
            } else {
                grade = "F";
            }

            System.out.println("입력 점수 : " + score);
            System.out.println("학점 : " + grade);
        }
    }
}