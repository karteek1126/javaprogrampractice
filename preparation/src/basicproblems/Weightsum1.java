package basicproblems;

import java.util.Scanner;

public class Weightsum1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a value");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		int rev = 0;
		int countsum = 0;

		while (temp > 0) {

			temp = temp / 10;
			count++;

		}

		for (; n > 0; count--) {

			int rem = n % 10;
			countsum = countsum +(rem * count);
			n = n/10;

		}
		
		System.out.println(countsum);

	}

}
