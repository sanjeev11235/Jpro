package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumberOrNot {// Number is binary or not 
	
	private static boolean isBinary(int num) {
		
		while(num !=0) {
			if(num % 10 >1) {
				return false;
			}
			num=num/10;
		}
		return true;		
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Number to Check Binary Or Not ");
		int num= Integer.parseInt(br.readLine());
		
		System.out.print(isBinary(num)? num+" Is Binary Number" : num+" Is Not Binary");
	}
}

