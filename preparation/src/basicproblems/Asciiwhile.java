package basicproblems;

import java.util.Scanner;

public class Asciiwhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value");
		int i = sc.nextInt();

		while (i <= 65) {
			
			i = i + 1;

		}
		System.out.println((char) i);
	}

}
