package Pattrens;

public class Patterens3 {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0;j <= (n-i-1); j++) {
				
				System.out.println("*");
			}
			
			System.out.println();
		}
	}

}
