package basicproblems;

import java.util.Scanner;


public class Reverforloop {

	public static void main(String[] args) {
		int B = 5678;
		int rv = 0;
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number");
	B = input.nextInt();
	
	for(;B>0;B = B/10) {
		
		int rem = B%10;
		rv = rv*10+rem;
		
	}
	
	System.out.println("reverse number is" + rv);
	
		
	}

}
