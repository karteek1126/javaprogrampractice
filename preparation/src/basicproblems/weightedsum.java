package basicproblems;

import java.util.Scanner;

public class weightedsum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		int temp = n;
		int total = 0;
		int re = 0;

		while (temp > 0) {
			total++;
			temp = temp / 10;
		}

		for (; 0 < n; total--) {

			int rem = n % 10;
			re = re + (rem * total);
			n = n / 10;

		}

		System.out.println(re);

	}

}
