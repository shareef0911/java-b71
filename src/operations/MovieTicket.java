package operations;

import java.util.Scanner;

public class MovieTicket {
	Scanner sc = new Scanner(System.in);
	int ticketPrice = 200;
	byte noOfTickets;
	String day;
	double total;

	void getData() {

		System.out.println("Enter No Of Tickets : ");
		noOfTickets = sc.nextByte();
		System.out.println("Enter day :");
		day = sc.next();

	}

	void calculate() {

		switch (day) {
		case "mon":
		case "tue":
		case "wed":
		case "thu":
		case "fri":
			System.out.println("Ticket Price : " + ticketPrice);
			break;
		case "sat":
		case "sun":
			ticketPrice += 50;
			System.out.println("Ticket Price : " + ticketPrice);
			break;
		default:
			System.out.println("Sorry, Invalid Day!");
			return;
		}
		if (noOfTickets < 0) {
//			noOfTickets = (byte) ((~noOfTickets) + 1);
			System.out.println("Invalid Ticket Count!");
			return;
		}

		total = ticketPrice * noOfTickets;
		System.out.println("No Of Tickets : " + noOfTickets);
		System.out.println("Total Bill : " + total);
		if (noOfTickets >= 4) {

			double discount = total * 0.15;
			total = total - discount;
			System.out.println("Discount : " + discount);
		}

		System.out.println("Final Bill : " + total);
		sc.close();
	}

	public static void main(String[] args) {

		MovieTicket mt = new MovieTicket();
		mt.getData();
		mt.calculate();
	}

}
