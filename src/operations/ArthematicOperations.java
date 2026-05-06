package operations;

public class ArthematicOperations {

	int add(int a ,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}
	int mod(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		
		int a1 = 10;
		int b1 = -20;
		
//		int temp = a1;
//		a1 = b1;
//		b1 = temp ;
		
		a1 = a1 +b1;
		b1 = a1-b1;
		a1 = a1-b1;
		
 		System.out.println("A1 value : "+a1);
		System.out.println("B1 value : "+b1);
		System.out.println(~a1);

		ArthematicOperations a = new ArthematicOperations();
		a.show();
	}
	void show() {
		System.out.println("Addition : "+add(3, 5));
		System.out.println("Subtraction : "+sub(7,6));
		System.out.println("Multiplication : "+mul(10, 5));
		System.out.println("Division Of Quoient : "+div(5,10));
		System.out.println("Division of Remainder : "+mod(5, 2));
	}

}
