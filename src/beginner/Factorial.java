package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {//factorial of number

	private static int fact(int num) {
		
		int fac=1;
		while(num > 0) {
			fac=fac* num;
			num--;
		}
		
		return fac;		
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter number to check its Factorial ");
		int num= Integer.parseInt(br.readLine());
		System.out.print("Factorial of "+num+" is "+fact(num));
	}
}
