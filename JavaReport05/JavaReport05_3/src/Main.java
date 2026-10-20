public class Main {
    public static void main(String[] args) {
        int totalSeconds = 36000;

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(totalSeconds + " 초 = "
                + hours + " 시간 "
                + minutes + " 분 "
                + seconds + " 초");
    }
}