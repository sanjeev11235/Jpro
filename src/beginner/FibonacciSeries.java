package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

	private static void display() throws NumberFormatException, IOException {
		
		int first=0,second=1,temp;
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Number to generate Fibonacci: ");
		int num=Integer.parseInt(br.readLine());
		System.out.print("Generated Fibonacci is "+first+" "+second);
		for(int i=0; i<num;i++) {
			temp=first+second;
			first=second;
			second=temp;
			System.out.print(" "+temp);
		}
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		display();
	}
}
