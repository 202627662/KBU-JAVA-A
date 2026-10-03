//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    int width, length, height, volume;

    System.out.print("직육면체 가로 입력 : ");
    width = scanner.nextInt();

    System.out.print("직육면체 세로 입력 : ");
    length = scanner.nextInt();

    System.out.print("직육면체 높이 입력 : ");
    height = scanner.nextInt();

    volume   = width * length * height;

    System.out.printf("직육면체 가로 = %d Cm\n", width);
    System.out.printf("직육면체 세로 = %d Cm\n", length);
    System.out.printf("직육면체 높이 = %d Cm\n", height);
    System.out.printf("직육면체 부피 = %d Cm\n", volume);
}


