package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindIndexSumOfElementsWhoseLeftIsEqualToRight {
	


	private static int findIndex(int[] arr) {//inds index in array such that - sum of elements on whose left is equal to sum of elements on right
		
		int leftIndex = 0, rightIndex = arr.length - 1;
        int leftSum=0 , rightSum = 0;
       
        while (leftIndex <= rightIndex) {
        	
        	if (leftSum > rightSum)
        		rightSum = rightSum + arr[rightIndex--];
        	else
        		leftSum = leftSum + arr[leftIndex++];
        }
        
//        System.out.println(leftSum+" "+rightSum);
        if (leftSum == rightSum)
        	return rightIndex;
        else
        	return -1;  //appropriate index not found
	}
	
	public static void main(String args[]) throws IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter elements to Check their left sum equal to right or not: ");
//		String s= br.readLine();
		int[] arr = { 2, 4, 4, 2, 6, 1, 1 };
		
		System.out.print("Elements are: ");
//			for(int i=0; i<arr.length; i++) {
//				arr[i] = s.charAt(i);
//			}
		for(int k:arr) {
			System.out.print(k);
		}
		int findIndex=findIndex(arr);
	    System.out.println(findIndex);
	    
		System.out.print(findIndex!=-1 ? "sum of elements on left(i.e. from index 0 to "+findIndex +") = sum of elements on right(i.e. from index " + (findIndex+1)+" to "+ (arr.length-1) +")"  : "No index found where  sum of elements on left = sum of elements on right");
		
	}
}
