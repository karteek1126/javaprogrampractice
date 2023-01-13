package basicproblems;

import java.util.Scanner;

public class Fabanacci_series {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = a + b;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		c = sc.nextInt();

		System.out.println(a + "\n" + b + "\n" + c);

		for (int i = 0; i < 4; i++) {

			a = b;
			b = c;
			c = a + b;
		}

		System.out.println(c + " ");

	}

}
