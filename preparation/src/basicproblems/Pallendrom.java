package basicproblems;

import java.util.Scanner;

public class Pallendrom {

	public static void main(String[] args) {

		int rev = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("enter number");
		int number = input.nextInt();
		int temp = number;

		while (number > 0) {

			int rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;

		}

		if (temp == rev) {

			System.out.println(temp + " is pallendrome ");
		}

		else {
			System.out.println(temp + " is not pallendrome");
		}

	}

}
