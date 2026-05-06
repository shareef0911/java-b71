package banking;
import java.util.Scanner;
public class Loan {
	Scanner sc = new Scanner(System.in);
	int getCibil() {
		System.out.println("Enter Your Cibil Score : ");
		int cibil = sc.nextInt();
		return cibil;
	}
	double getSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}
	byte getAge() {
		System.out.println("Enter Your Age : ");
		byte age = sc.nextByte();
		return age;
	}
	boolean isValidPan() {
		System.out.println("Enter PAN number : ");
		String pan = sc.next();
		pan = pan.toUpperCase();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	
	boolean isValidAadhaar() {
		System.out.println("Enter Aadhar Number : ");
		String aadhar = sc.next();
		return aadhar.matches("\\d{12}");
	}
	boolean isValidPhone() {
		System.out.println("Enter Phone Number : ");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}
	String customerAddressDetails() {
		String address = "null";
		System.out.println("Enter Flat No : ");
		String flat = sc.next();
		System.out.println("Enter Building : ");
		String building = sc.next();
		System.out.println("Enter City Name : ");
		String city = sc.next();
		System.out.println("Enter Pin Code : ");
		String pin = sc.next();
		
		address = "Flat No : "+flat +", Building NO : "+building + ", City Name : "+ city + ", PinCode : "+pin;
		return address;
	}
	
	double getROI() {
		return 10.5;
	}
	
}
