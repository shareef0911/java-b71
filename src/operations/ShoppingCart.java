package operations;
import java.util.Scanner;

class ShoppingCart {
	 Scanner sc = new Scanner(System.in);
    double price;
    int quantity;
    double total;
    double finalAmount;

    void getData() {

        System.out.print("Enter item price: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
    }

    void calculateBill() {
        total = price * quantity;

        // Discount rule: ₹300 off for every ₹1500 spent
        int discountBlocks = (int)(total / 1500);
        double discount = discountBlocks * 300;

        finalAmount = total - discount;

        System.out.println("Total Amount: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Shopping Cart");

        ShoppingCart cart = new ShoppingCart();

        cart.getData();
        cart.calculateBill();
    }
}