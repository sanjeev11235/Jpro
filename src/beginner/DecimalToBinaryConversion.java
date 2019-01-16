package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinaryConversion {

	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter number to change it to binary: ");
		int num=Integer.parseInt(br.readLine());
		
		System.out.println(num+" Decimal to "+decimalToBinaryConverte(num)+" Binary ");
		
	}

	private static String decimalToBinaryConverte(int num) {
		
		if(num == 0)
			return "0";
		String binary="";
		while(num>0) {
			binary=num%2+binary;
			num=num/2;
		}
		return binary;
	}
}
