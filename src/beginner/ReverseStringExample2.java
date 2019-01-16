package beginner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringExample2 {// Reverse String using Swapping

	static void display() throws IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter String to reverse it: ");
		String s= br.readLine();
		char ar[]=new char[s.length()];
		char temp;
		
		for(int i=0; i<ar.length;i++) {
			ar[i]=s.charAt(i);
		}
		for(int i=0, j=(ar.length-1); i<(ar.length/2);i++,j-- ) {
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		System.out.print("Reverse String is: ");
		for(char k: ar) {
			System.out.print(k);
		}
	}
	
	public static void main(String args[]) throws IOException {
		display();
	}
}
