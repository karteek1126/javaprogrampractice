package basicproblems;

import java.util.Scanner;

public class Trimorphicnubmer {

	public static void main(String[] args) {

		int t = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int n = sc.nextInt();
		int temp = n;

		while (temp > 0) {

			t++;

			temp = temp / 10;

		}

		temp = n * n * n;

		for (int i = 0; i < t; i++) {

			int reminder = temp % 10;
			rev = rev * 10 + reminder;
			temp = temp / 10;

		}
		
		temp = 0;

		while (rev > 0) {
			int rem = rev % 10;
			temp = temp * 10 + rem;
			rev = rev / 10;

		}

		if (rev == n) {

			System.out.println(n + "is a trinorphicnumber");
		}

		else {

			System.out.println(n + " is not a trinorphicnumber");
		}

	}

}
