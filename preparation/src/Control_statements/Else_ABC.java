package Control_statements;

public class Else_ABC {

	public static void main(String[] args) {
		
		int A = 20;
		int B = 30;
		int C = 40;
		
		if(A > B && A > C) {
			
			System.out.println(A + " Greater then B and C");
		}
		
		else if  (B > C) {
			
			System.out.println(B + " Greater then C and A ");
		}
		
		else{
			
			System.out.println(C + " is Greater then " + B + " and " + A);
		}

	}

}
