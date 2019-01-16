package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsInNumber {//sum of digits in number like 555 - 5+5+5=15


	private static void display() throws NumberFormatException, IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Number to find sum of digits in number ");
		int num= Integer.parseInt(br.readLine());
		
		int remainder,sum=0;
		while(num > 0) {
			remainder=num%10;
//			System.out.print(" "+remainder);
			num=num/10;
//			System.out.print(" "+num);
			sum+=remainder;
//			System.out.print(" "+sum);
//			System.out.println();
		}		
		System.out.print(sum);
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		display();
	}
}
