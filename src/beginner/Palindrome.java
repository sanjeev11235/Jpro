package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	


	private static boolean isPalindrome(char[] arr) {
		
		for(int i=0,j=arr.length-1; i<(arr.length/2); i++,j--) {
			
			if(arr[i]!=arr[j]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) throws IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter String to check Palindrome Or Not: ");
		String s=br.readLine();
		char arr[]=new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			arr[i]=s.charAt(i);
		}
		System.out.print("Entered String is: ");
		for(char ch:arr) {
			System.out.print(ch);
		}
		System.out.println();
		System.out.println(isPalindrome(arr)? s+" Is a Palindrome String " : s+" Not a Palindrome String " );;
	}
}
