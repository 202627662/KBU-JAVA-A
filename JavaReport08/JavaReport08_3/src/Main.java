
public class Main {

    public static void main(String[] args) {

        final int WELL = 300;    // 우물 깊이 (cm)
        final int UP = 55;       // 낮 동안 올라가는 거리 (cm)
        final int DOWN = 13;     // 밤에 미끄러지는 거리 (cm)
        final int WEEK = 7;      // 방울꽃이 시들기까지의 날 수

        int height = 0;          // 현재 높이 (cm)
        int day = 0;

        while (true) {
            day++;
            height += UP;

            System.out.printf("%d일째 낮: %3d cm", day, height);

            if (height >= WELL) {
                System.out.println("  -> 우물 탈출!");
                break;
            }

            height -= DOWN;
            System.out.printf(", 밤: %3d cm\n", height);
        }

        if (day <= WEEK)
            System.out.printf("\n%d일째에 탈출 -> 방울꽃 곁을 지킬 수 있음\n", day);
        else
            System.out.printf("\n%d일째에 탈출 -> 방울꽃 곁을 지킬 수 없음\n", day);
    }
}
