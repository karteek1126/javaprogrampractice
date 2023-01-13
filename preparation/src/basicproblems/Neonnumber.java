package basicproblems;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {

		Scanner aravind = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = aravind.nextInt();
		int temp = n;
		int rem = 0;
		int cub = 0;
		int cubsum = 0;

		while (n > 0) {

			rem = n % 10;
			cub = rem * rem * rem;
			cubsum = cubsum + cub;
			n = n / 10;
		}

		if (temp == cubsum) {

			System.out.println(temp + "is a amstrong number");
		}

		else {

			System.out.println(temp + "is not a amstrong number");
		}

	}

}
