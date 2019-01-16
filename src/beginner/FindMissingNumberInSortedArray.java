package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMissingNumberInSortedArray {//find Missing numbers between 1 to 100 in sorted array
	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		boolean q;
		
		System.out.println("Enter Random Number in ascending order b/w 1 to 100 to check what are missing ");
		System.out.print("Enter No. of element you want to insert: ");
		
		int n=Integer.parseInt(br.readLine());
		
//		System.out.println();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {	
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Numbers Missing 1 to 100 are: ");
		int j=0;
		for(int i=1; i<=100; i++) {
			
			if(j<arr.length && i==arr[j]) {
				j++;
			}
			else {
				System.out.print(i+" ");
			}
		}
		
	}

}
