import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost = calculateShipping(itemPrice);
        double totalPrice = itemPrice + shippingCost;


        System.out.println("Your shipping cost is: $" + shippingCost);
        System.out.println("Your total price is: $" + totalPrice);
    }
    static double calculateShipping(double price) {
        if (price >= 100) {
            return 0;

        } else {
            return price * 0.02;
        }

    }
}