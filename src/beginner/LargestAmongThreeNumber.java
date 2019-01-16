package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestAmongThreeNumber {

	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		System.out.print("Enter Three Numbers to check gretest one: ");
		int num=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int num3=Integer.parseInt(br.readLine());
		
		if(num>num2 && num>num3)
			System.out.println(num +" is gretest ");
		else if(num2>num && num2>num3)
			System.out.println(num2+" is gretest ");
		else if(num3>num && num3> num2)
			System.out.println(num3+" is greatest ");
		else 
			System.out.println(num+" "+num2+" "+num3+" are same ");
	}
}
