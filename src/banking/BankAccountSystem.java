package banking;
import java.util.Scanner;
public class BankAccountSystem {
	
	long accNumber =19821010013l ;
	String accHolder;
	double balance;
	double depositBalance;
	double withdrawalBalance;
	BankAccountSystem(){
		this(19821010013l);
		balance = 0.0;
		accHolder = "null";
		
		
	}
	BankAccountSystem(long accNumber){
		this(accNumber,"null");
		
	}
	BankAccountSystem(long accNumber,String accHolder){
		this(accNumber,accHolder,0.0);
	}
	BankAccountSystem(long accNumber,String accHolder,double balance){
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	double deposit(double depositBalance) {
		balance = balance + depositBalance;
		return balance;
	}
	double withdrawal(double withdrawalBalance) {
		balance = balance - withdrawalBalance;
		return balance;
	}
	
	void display() {
		System.out.println("Acc Number : "+accNumber);
		System.out.println("Acc holder Name : "+accHolder);
		System.out.println("Balance : "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		long accNumber = sc.nextLong();
		System.out.println("Enter Account Holder Name : ");
		String accHolder = sc.next();
		BankAccountSystem ba = new BankAccountSystem(accNumber,accHolder);
//		ba.deposit(50000);
//		ba.withdrawal(1000);
		ba.display();
		
		

	}

}
