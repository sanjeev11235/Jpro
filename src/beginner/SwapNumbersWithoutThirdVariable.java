package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNumbersWithoutThirdVariable {// Swap two numbers without using third variable
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter First Number To Swap: ");
		int num=Integer.parseInt(br.readLine());
		System.out.print("Enter Second Number to Swap: ");
		int num2=Integer.parseInt(br.readLine());
		
		System.out.println("Entered Number Before Swapping Are: "+num+" "+num2);

		num  =num+num2;
		num2 =num-num2;
		num  =num-num2;
		
		System.out.print("Numbers After Swapping Are: "+num+" "+num2);
	}
}
