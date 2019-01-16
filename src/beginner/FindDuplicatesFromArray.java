package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicatesFromArray {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.println("Enter Numbers to find duplicate: ");
		char[] arr= br.readLine().toCharArray();
		
		int arrSize=arr.length;
		int sumOfArr=0;
		for(int k:arr) {
			sumOfArr+=(int)k;
		}
		System.out.print("Duplicate No is ");
		for(int i=0; i<arr.length; i++) {
			
			int duplicateNo= sumOfArr-((arrSize)*(arrSize+1)/2);
			System.out.println(duplicateNo);
		}
	}
}
