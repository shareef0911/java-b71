package banking;

import java.util.Scanner;

public class VehicleLoan extends Loan{

	Scanner sc = new Scanner(System.in);
	long vehiclePrice;
	long downPayment;
	long requireLoan;
	
	long readVehiclePrice() {
		System.out.println("Enter Vehicle Price :");
		vehiclePrice = sc.nextLong();
		return vehiclePrice;
	}
	
	long readDownPayment() {
		System.out.println("Enter DownPayment Amount :");
		downPayment = sc.nextLong();
		if (downPayment >= vehiclePrice) {
	        System.out.println("Invalid Down Payment!");
	        return -1;
	    }
		return downPayment;
	}
	long readRequireLoan() {
		long requireLoan1 = (vehiclePrice - downPayment);
		System.out.println("Your Loan Amount Must Be Less Than : "+requireLoan1);
		System.out.println("Enter Require Loan Amount :");
		requireLoan = sc.nextLong();
		if(requireLoan <= (vehiclePrice - downPayment)){
			System.out.println("Your Require Loan Amount : "+requireLoan);
		}
		else {
			System.out.println("Sorry Your Require Loan Is Not Approval !! ");
		}
		return requireLoan;
	}
	double getROI() {
		return 7.5;
	}
	void getDocInfo() {
		System.out.println("Successfully Entered Your Vehicle Loan Documents!!");
	}
	public static void main(String[] args) {
		System.out.println("Welcome To Vehicle Loan Banking!!");
		VehicleLoan vl = new VehicleLoan();
		
		long cibil = vl.getCibil();
		double salary = vl.getSalary();
		byte age = vl.getAge();
		vl.readVehiclePrice();
		vl.readDownPayment();
		vl.readRequireLoan();
		
		
		if(cibil > 700 && salary > 800000 && age > 25  && vl.isValidPhone() && vl.isValidAadhaar() && vl.isValidPan()) {
			System.out.println("Your Vehicle Loan  is Approved !!");
			System.out.println("The Approval Amount is "+ vl.requireLoan );
			System.out.println("Your ROI Is : "+vl.getROI());
			System.out.println("Confirm  Your Address Details :");
			System.out.println(vl.customerAddressDetails());
			vl.getDocInfo();
			
			
		}else {
			System.out.println("Sorry Your Vehicle Loan Is Rejected!!");
		}
		
		
		
	}

}
