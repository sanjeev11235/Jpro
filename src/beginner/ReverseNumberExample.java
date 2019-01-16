package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumberExample {

	private static void display() throws IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Number to reverse: ");
		int number= Integer.parseInt(br.readLine());
		
		int reverse=0,remainder;
		
		while(number>0) {
			remainder=number%10;
			number=number/10;
			reverse=reverse*10+remainder;
		}
		System.out.print("Reverse Number is: "+reverse);
	}
	
	public static void main(String args[]) throws IOException {
		display();
	}
}
