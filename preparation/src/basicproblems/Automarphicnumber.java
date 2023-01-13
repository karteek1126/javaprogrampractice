package basicproblems;

import java.util.Scanner;

public class Automarphicnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int reverse = 0;
		int total = 0;

		while (temp > 0) {
			total++;
			temp = temp / 10;

		}

		temp = n * n;

		for (int i = 0; i < total; i++) {

			int reminder = temp % 10;
			rev = rev * 10 + reminder;
			temp = temp / 10;

		}
		
		temp = 0;
		while (rev > 0) {

			int rem = rev % 10;
			reverse = reverse * 10 + rem;
			rev = rev / 10;

		}

		if (reverse == n) {

			System.out.println(n + " is a automarphic number");

		}

		else {

			System.out.println(n + " is not a automarphic number");
		}

	}

}
