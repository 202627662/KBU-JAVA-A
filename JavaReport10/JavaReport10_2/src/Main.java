import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이대한", "한나라", "이순신", "김동근",
                "김현호", "이동국", "박예림", "김혜숙", "나희영"};
        double[] weight = new double[name.length];
        double total = 0.0;
        double average;
        int upCount = 0;                           // 평균 이상자 수
        double ratio;
        String s_temp;
        double d_temp;
        int i, j;

        i = 0;
        while (i < name.length) {                  // 몸무게 입력 (30.0 ~ 120.0)
            System.out.printf("%d 번째 %s님의 몸무게(Kg) : ", i + 1, name[i]);
            weight[i] = keyboard.nextDouble();
            if (weight[i] >= 30.0 && weight[i] <= 120.0) {
                i++;
            } else {
                System.out.println(" ERROR 몸무게는 30.0Kg에서 120.0Kg 사이의 값");
            }
        }

        for (i = 0; i < weight.length; i++)        // 평균 몸무게
            total += weight[i];
        average = total / weight.length;

        for (i = 0; i < weight.length; i++)        // 평균 이상자 수
            if (weight[i] >= average)
                upCount++;
        ratio = (double) upCount / weight.length * 100;

        for (i = 0; i < name.length - 1; i++)      // 몸무게 내림차순 정렬 (Selection Sort)
            for (j = i + 1; j < name.length; j++) {
                if (weight[i] < weight[j]) {
                    d_temp = weight[j];
                    weight[j] = weight[i];
                    weight[i] = d_temp;

                    s_temp = name[j];
                    name[j] = name[i];
                    name[i] = s_temp;
                }
            }

        System.out.println();
        System.out.println("***************************************");
        System.out.printf("평균 몸무게 : %.2f Kg\n", average);
        System.out.printf("평균 이상자 : %d명 (비율 %.1f%%)\n", upCount, ratio);
        System.out.println("***************************************");
        System.out.println("[몸무게 상위 2명]");
        for (i = 0; i < 2; i++)
            System.out.printf(" %d위 %s : %.1f Kg\n", i + 1, name[i], weight[i]);
        System.out.println("[몸무게 하위 2명]");
        for (i = name.length - 1; i >= name.length - 2; i--)
            System.out.printf(" %d위 %s : %.1f Kg\n", name.length - i, name[i], weight[i]);
        System.out.println("***************************************");
    }
}
