package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeStringCharactersCase {
	


	private static String changeCase(String s) {
		char arr[]=s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>=65 && arr[i]<=90) {
				arr[i]+=32;
			}
			else if(arr[i]>=97 && arr[i]<=122) {
				arr[i]-=32;
			}
		}
		return new String(arr);
	}

	public static void main(String args[]) throws IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter String to change its Character case: ");
		String s= br.readLine();
		System.out.println("Entered String: '"+s+"' "+"Changed String is: '"+changeCase(s)+"'");
	}
}
