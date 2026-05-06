package mobileRechargeSystem;

import java.util.Scanner;

public class Customer extends Plans {
	Scanner sc = new Scanner(System.in);
	String phoneNumber;
	String customerName;
	String networkProvider;

	String phoneNumber() {
		System.out.println("Enter Phone Number : ");
		phoneNumber = sc.next();
		return phoneNumber;
	}

	boolean isValidPhoneNumber() {
		return phoneNumber.matches("[6-9]\\d{9}");
	}

	String customerName() {
		System.out.println("Enter Your Name :");
		customerName = sc.next();
		return customerName;
	}

	String networkProvider() {
		System.out.println("Enter Network Provider :");
		networkProvider = sc.next();
		return networkProvider;
	}
	void paymentMode() {

		System.out.println("1. UPI");
		System.out.println("2. Debit Card");
		System.out.println("3. Credit Card");
		System.out.println("4. Wallet");

		System.out.println("Choose Payment Mode:");
		int choice = sc.nextInt();

		System.out.println("\nRecharge Successful!");
		System.out.println("Mobile Number : +91 " + phoneNumber);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Your Network Provider : "+networkProvider);
		System.out.println("Plan Amount : " + selectedPlan);
		System.out.println("Validity : " + validity);
		System.out.println("Benefits : " + benefits);
		switch(choice) {
		case 1:
			System.out.println("Payment Mode : UPI");
			break;
		case 2:
			System.out.println("Payment Mode : Debit Card");
			break;
		case 3:
			System.out.println("Payment Mode : Credit Card");
			break;
		case 4:
			System.out.println("Payment Mode : Wallet");
			break;
			
		}
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.phoneNumber();
		int choice;
		if (c.isValidPhoneNumber()) {
			c.customerName();
			c.networkProvider();
			do {
				System.out.println("\n1. Data Pack");
				System.out.println("2. Talktime Pack");
				System.out.println("3. Unlimited Pack");
				System.out.println("4. Exit");

				System.out.print("Enter your choice: ");
				choice = c.sc.nextInt();

				switch (choice) {
				case 1:
					c.getDataPack();
					break;
				case 2:
					c.getTalktimePack();
					break;
				case 3:
					c.getUnlimitedPack();
					break;
				case 4:
					System.out.println("Thank you for using Our Network Provider!");
					break;

				default:
					System.out.println("Invalid Choice!!");
				}
			} while (choice != 1 && choice != 2 && choice != 3 && choice != 4);
			System.out.println("Do you want to continue?");
			System.out.println("1.yes");
			System.out.println("2.no");
			int choice1 = c.sc.nextInt();
			if (choice1 ==1) {
				System.out.println("Choose your Payment mode : ");
				c.paymentMode();
			}
		} else {
			System.out.println("Invalid Number : ");
		}

	}

}
