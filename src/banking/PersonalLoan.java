package banking;
import java.util.Scanner;
public class PersonalLoan extends Loan{
	
	Scanner Sc = new Scanner(System.in);
	
	void getDocInfo() {
		System.out.println("Your All Are Documents Are Submitted For Personal Loan !!");
	}
	double getROI() {
		return 8.5;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan Banking !!");
		
		PersonalLoan pl = new PersonalLoan();
		Loan l1 = new PersonalLoan();
		
		int cibil = pl.getCibil();
		double salary = pl.getSalary();
		byte age = pl.getAge();
		
		if(cibil >730 && salary > 600000 && age > 21 && age < 55 && pl.isValidPhone() && pl.isValidPan() && pl.isValidAadhaar()) {
			System.out.println("Congratulations Your Personal Loan is Approved !!");
			System.out.println("Your Loan RoI is "+l1.getROI());
			System.out.println("Confirm your Address Details : ");
//			pl.customerAddressDetails();
			System.out.println(pl.customerAddressDetails());
			pl.getDocInfo();
		}else {
			System.out.println("Sorry ! , Your Personal Loan is Rejected.");
		}
		
	}

}
