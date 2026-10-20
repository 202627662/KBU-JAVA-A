//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. i가 j로 나누어 떨어진다.
        int i = 10;
        int j = 2;
        System.out.println("1: " + (i % j == 0));

        // 2. age는 12보다 작거나 같다.
        int age = 12;
        System.out.println("2: " + (age <= 12));

        // 3. age는 b보다 작고 c보다 크다.
        int b = 20;
        int c = 10;
        System.out.println("3: " + (age < b && age > c));

        // 4. age에서 5를 빼면 10과 같다.
        age = 15;
        System.out.println("4: " + (age - 5 == 10));

        // 5. age는 b와 같지 않거나 c와 같다.
        System.out.println("5: " + (age != b || age == c));

        // 6. 소문자이다.
        char letter = 'm';
        System.out.println("6: " + (letter >= 'a' && letter <= 'z'));

        // 7. ch가 영문자이다.
        char ch = 'K';
        System.out.println("7: " +
                ((ch >= 'A' && ch <= 'Z') ||
                        (ch >= 'a' && ch <= 'z')));

        // 8. 윤년 조건이다.
        int year = 2024;
        System.out.println("8: " +
                (year % 400 == 0 ||
                        (year % 4 == 0 && year % 100 != 0)));

        // 9. powerOn이 false이다.
        boolean powerOn = false;
        System.out.println("9: " + (!powerOn));

        // 10. str의 내용이 "yes"이다.
        String str = "yes";
        System.out.println("10: " + ("yes".equals(str)));
    }
}