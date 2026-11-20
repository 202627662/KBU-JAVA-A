
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] name = {"홍길동", "이대한", "한민국", "경복대", "이미숙", "나추가"};
        char[] attend = new char[name.length];

        int count = 0;   // 결석자 수
        float rate;      // 결석률
        int i = 0;

        /************** 입력 **************/
        while (i < name.length) {
            System.out.printf("%s님 출석 했나요 ? (1 = 출석/ 0 = 결석) ", name[i]);

            String input = keyboard.nextLine();

            if (input.equals("0") || input.equals("1")) {
                attend[i] = input.charAt(0);
                i++;
            } else {
                System.err.println("ERROR : 출석 = 1, 결석 = 0");
            }
        }

        /************** 처리 **************/
        for (i = 0; i < attend.length; i++) {
            if (attend[i] == '0')
                count++;
        }

        rate = (float) count / name.length * 100;

        /************** 출력 **************/
        System.out.println();

        for (i = 0; i < name.length; i++) {
            System.out.printf("%s님 %s\n", name[i],
                    attend[i] == '1' ? "출석" : "결석");
        }

        System.out.println("결석자 수 = " + count);
        System.out.printf("결석률 : %.2f %%\n", rate);

        keyboard.close();
    }
}
