package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberOrNot {


	private static boolean isPrime(int num) {
	
		for(int i=2; i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Number to Check Prime Or Not ");
		int num=Integer.parseInt(br.readLine());
		
		System.out.print(isPrime(num)? num+" Is Prime NO." : num+" Is Not Prime No." );;
		
		
		
	}
}
