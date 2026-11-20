
public class Main {
    public static void main(String[] args) {

        int test;               // 단순 변수 : 선언

        int[] sample;           // 배열 선언
        sample = new int[5];    // 배열 생성, 0으로 초기화

        int[] score = new int[5];  // 선언 + 생성
        score[0] = 100;
        score[1] = 120;
        score[2] = 300;
        score[3] = 400;
        score[4] = 700;

        int[] grade = new int[] {100, 120, 300, 400, 700};

        int[] grade1 = {100, 120, 300, 400, 700};

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
        }
    }
}
