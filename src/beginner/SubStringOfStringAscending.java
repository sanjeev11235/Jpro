package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringOfStringAscending {

	public static void main(String args[]) throws IOException {
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new  BufferedReader(r);
		
		System.out.print("Enter a String ");
		String s=br.readLine();
		char[] ar=new char[s.length()+1];
		char tmp = 0;
		for(int i=0; i<s.length(); i++) {
			ar[i]=s.charAt(i);
		}
		
		System.out.print("Entered String is ");
		for(char k:ar) {
			System.out.print(k);
		}
		
		//code to find substring in alphabatical order
		System.out.println(ar.length);
		
		for(int j=0; j<ar.length-1; j++) {
			
			int a =(char)ar[j];
			int b =(char)ar[j+1];
			int k=b-a;
//			System.out.printf("%d %d %d",a,b,k);
			if(k==1) {
				System.out.printf("%c %c",a,b);
			}
			System.out.println();
		}
		
	}
}
