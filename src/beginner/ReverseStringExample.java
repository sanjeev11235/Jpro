package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringExample {// Reverse String using  String - CharArray 

	static void display() throws IOException {
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
	
		System.out.print("Enter String to reverse: ");
		String s= br.readLine();
		char ar[]=new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			ar[i]=s.charAt(i);
		}
		System.out.print("Reverse String is: ");
		
		
		for(int j=ar.length-1; j>=0; j--) {
			System.out.print(ar[j]);
		}
	}
	
	public static void main(String args[]) throws IOException {
		display();
	}
}
