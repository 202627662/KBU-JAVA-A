
public class Main {

    public static void main(String[] args) {

        final int HEAD = 37;     // 닭과 개의 합
        final int LEG = 102;     // 다리의 합

        int chicken, dog;

        // 1. for 문
        System.out.println("=== for 문 ===");

        for (chicken = 0; chicken <= HEAD; chicken++) {
            dog = HEAD - chicken;

            if (chicken * 2 + dog * 4 == LEG)
                System.out.printf("닭 = %d마리, 개 = %d마리\n", chicken, dog);
        }

        // 2. while 문
        System.out.println("=== while 문 ===");

        chicken = 0;

        while (chicken <= HEAD) {
            dog = HEAD - chicken;

            if (chicken * 2 + dog * 4 == LEG)
                System.out.printf("닭 = %d마리, 개 = %d마리\n", chicken, dog);

            chicken++;
        }

        // 3. do ~ while 문
        System.out.println("=== do ~ while 문 ===");

        chicken = 0;

        do {
            dog = HEAD - chicken;

            if (chicken * 2 + dog * 4 == LEG)
                System.out.printf("닭 = %d마리, 개 = %d마리\n", chicken, dog);

            chicken++;

        } while (chicken <= HEAD);
    }
}
