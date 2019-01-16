package beginner;

import java.util.ArrayList;
import java.util.List;

public class FindOnlyDuplicateNumberInList {//Find only duplicate number in given list

	private static int duplicate(List<Integer> list, int listSize) {
		
		int sumOfList=0;
		
		for(int n:list) {
			sumOfList+=n;
		}
		
		int duplicateNo=sumOfList-((listSize) * (listSize+1)/2);
		
	    if( duplicateNo < 0){
            return -(duplicateNo);
        }else {
            return duplicateNo;
        }
	}
	public static void main(String args[]) {
		
		List <Integer>list=new ArrayList<Integer>();
		int listSize=10;
		
		for(int i=0; i<listSize; i++) {
			list.add(i);
		}
		list.add(5);
		System.out.println("Element in List Are: "+list);
		
		System.out.println("Duplicate No In List Is: "+duplicate(list,listSize));
	}
}
