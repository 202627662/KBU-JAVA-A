
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your weight on Earth (kg): ");
    double weight = scanner.nextDouble();

    double moonWeight = weight * 0.165;

    System.out.println("Weight on Earth: " + weight + "kg");
    System.out.println("Weight on the Moon: " + moonWeight + "kg");
}
