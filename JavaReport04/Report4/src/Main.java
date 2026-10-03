//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter total payment amount (Won): ");
    double totalAmount = scanner.nextDouble();

    double price = totalAmount / 1.10;

    double Tax = price * 0.10;

    System.out.println("Amount (Price): " + Math.round(price) + " Won ");
    System.out.println("Tax (VAT): " + Math.round(Tax) + " Won ");
}
