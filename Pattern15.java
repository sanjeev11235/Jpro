package symbol;

public class Pattern15 {

	static void display() {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}
/*
Output:

*****
****
***
**
*

*/