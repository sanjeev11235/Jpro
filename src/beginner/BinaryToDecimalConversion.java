package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimalConversion {

	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Binary and change it to Decimal: ");
		int num= Integer.parseInt(br.readLine());
		
		System.out.print(num+" Binary to "+binaryToDecimalConverter(num)+" Decimal ");
	}

	private static int binaryToDecimalConverter(int num) {
		
		int decimal=0,power=0;
		
		while(num >0) {
			decimal+=(num % 10)* Math.pow(2, power++);
			num=num/10;
		}
		return decimal;
	}
}
