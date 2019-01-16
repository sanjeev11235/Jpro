package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberIsOddOrEven {//Find number is odd or even without % operator

	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter number to check even or odd: ");
		int num= Integer.parseInt(br.readLine());
		
		if((num &1)==0)
			System.out.println(num+" is even ");
		else
			System.out.print(num+" is odd ");
		
	}
}

