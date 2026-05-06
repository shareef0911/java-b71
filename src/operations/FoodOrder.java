package operations;
import java.util.Scanner;
public class FoodOrder {
	double itemPrice;
	byte noOfItems;
	double total;
	void getData() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Price Of Item : ");
		itemPrice = sc.nextDouble();
		System.out.println("Enter No Of Quantities : ");
		noOfItems = sc.nextByte();
		sc.close();
	}
	void calculateBill() {
		total = itemPrice * noOfItems;
		System.out.println("Total Amount : "+total);
		
		int discountBlocks = (int) (total/1000);
		double discount = discountBlocks * (1000*0.10);
		System.out.println("Your Discount Amount : "+discount);
		total = total -discount;
		
		System.out.println("Final Bill Amount is : "+total);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder fo = new FoodOrder ();
		fo.getData();
		fo.calculateBill();
		if (fo.noOfItems >= 5) {
			System.out.println("Free Delivery Enjoy!");
		}else {
			double delivery =fo.total*0.02;
			System.out.println("Your Delivery Fee is : "+delivery);
		}
	}

}
