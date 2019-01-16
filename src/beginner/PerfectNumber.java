package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {

	private static boolean isPerfectNumber(int num) {
		
		   int sumOfDivisors = 1; //1 is divisor of all the numbers, so initially keep the sumOfDivisors=1 and start check divisors from 2.
		   
		   for(int i=2;i<=num/2;i++)
		         if(num%i == 0)
		             sumOfDivisors += i;  
		       
		        if(sumOfDivisors == num)
		         return true;
		        else
		         return false;
		   
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter a number to check perfect number or not: ");
		int num= Integer.parseInt(br.readLine());
		
		System.out.print(isPerfectNumber(num)? num+" is perfect number ": num+" is not a perfect number ");
		
	}
}
