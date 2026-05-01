package banking;

import java.util.Scanner;

public class BankingAccount {

    // Instance variables (data)
    final long accNumber;
    String accHolder;
    double balance;

    // Constructor
    BankingAccount(long accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully!");
        }
    }

    // Display method
    void display() {
        System.out.println("\n------ Account Details ------");
        System.out.println("Account Number : " + accNumber);
        System.out.println("Account Holder : " + accHolder);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Banking System");

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        // Object creation
        BankingAccount acc = new BankingAccount(accNo, name, 0.0);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    acc.display();
                    break;

                case 4:
                    System.out.println("Thank you for using Banking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}