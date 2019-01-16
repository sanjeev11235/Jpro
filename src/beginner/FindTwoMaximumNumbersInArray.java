package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTwoMaximumNumbersInArray {
	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Numbers you want to Enter: ");
		int n= Integer.parseInt(br.readLine());
		int arr[] =new int[n];
		int max1=0,max2=0;
		System.out.print("Enter Numbers to check two max among all: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		for(int j=0; j<arr.length; j++) {// //only one iteration
			
			if(max1<arr[j]) {
				max2=max1;
				max1=arr[j];
			}
			else if(max2<arr[j]){
				max2=arr[j];
			}
		}
		
		System.out.println("first max no. is "+max1);
		System.out.println("second max no. is "+max2);
	}
}
