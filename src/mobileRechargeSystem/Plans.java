package mobileRechargeSystem;

import java.util.Scanner;

public class Plans {
	String selectedPlan;
	String validity;
	String benefits;
	Scanner sc = new Scanner(System.in);
	void getTalktimePack() {
		System.out.println("1.₹100 → ₹81 talktime");
		System.out.println("2.₹500 → ₹420 talktime");
		int choice;
		System.out.println("Enter Your Plan");
		choice = sc.nextInt();
		switch (choice) {

		case 1:
			selectedPlan = "₹100";
			validity = "Unlimited";
			benefits = "₹81 talktime";
			break;

		case 2:
			selectedPlan = "₹500";
			validity = "Unlimited";
			benefits = "₹420 talktime";
			break;

		default:
			System.out.println("Invalid Plan");
			return;
		}

		System.out.println("Plan Selected Successfully!");
		
	}
	void getUnlimitedPack() {
		System.out.println("1.₹239 → Unlimited calls + 28 days");
		System.out.println("2.₹399 → Unlimited calls + 56 days");
		int choice;
		System.out.println("Enter Your Plan");
		choice = sc.nextInt();
		switch (choice) {

		case 1:
			selectedPlan = "₹239";
			validity = "28 Days";
			benefits = "Unlimited calls";
			break;

		case 2:
			selectedPlan = "₹399";
			validity = "56 Days";
			benefits = "Unlimited calls";
			break;

		default:
			System.out.println("Invalid Plan");
			return;
		}

		System.out.println("Plan Selected Successfully!");
		
	}

	void getDataPack() {

		System.out.println("1. ₹199 → 1.5GB/day, 28 days");
		System.out.println("2. ₹299 → 2GB/day, 28 days");
		System.out.println("3. ₹666 → 1.5GB/day, 84 days");

		System.out.println("Enter Your Plan:");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			selectedPlan = "₹199";
			validity = "28 Days";
			benefits = "1.5GB/day";
			break;

		case 2:
			selectedPlan = "₹299";
			validity = "28 Days";
			benefits = "2GB/day";
			break;

		case 3:
			selectedPlan = "₹666";
			validity = "84 Days";
			benefits = "1.5GB/day";
			break;

		default:
			System.out.println("Invalid Plan");
			return;
		}

		System.out.println("Plan Selected Successfully!");
	}

}
