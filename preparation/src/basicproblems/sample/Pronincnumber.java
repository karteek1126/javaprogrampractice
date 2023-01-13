package basicproblems.sample;

import java.util.Scanner;

public class Pronincnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();

		for (int i = 0; i <= 100; i++) {

			i = i * (i + 1);

			System.out.println(i);
		}

	}

}
