package beginner;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatNumberInList {

	public static void main(String args[]) {
		List <Integer>list = new ArrayList<Integer>();
		int listSize=10;
		for(int i=0; i<listSize; i++) {
			list.add(i);
		}
		list.add(5);
		list.add(6);
		System.out.println("Elements in List are: "+list);
		System.out.println("\nNon Duplicate Elements are: "+findAllDuplicate(list));;
	}

	private static List<Integer> findAllDuplicate(List<Integer> list) {
		List <Integer> listWithoutDuplicates =new ArrayList<Integer>();
		System.out.print("Duplicate Elements in list are: ");
		
		for(int i:list) {
			if(listWithoutDuplicates.contains(i)) {
				System.out.print(i+" ");
			}
			else
				listWithoutDuplicates.add(i);
		}
		return listWithoutDuplicates;
	}
}
