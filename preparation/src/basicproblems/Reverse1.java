package basicproblems;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {
		
		int A = 12;
		int rev = 0;
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter a number");
		A = sca.nextInt();
		
		while(A>0) {
			
			int rem = A%10;
			rev = rev*10+rem;
			A = A/10;
		}
		
		System.out.println(" Reverse number is " + rev);
	

	}

}
