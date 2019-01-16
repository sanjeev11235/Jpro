package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringExample3 {// Reverse String Using String BufferExample

	public static void main() throws IOException {
		
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter String to reverse: ");
		String s= br.readLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.print("Reverse String is: "+sb.reverse());
		
		/*
			StringBuffer ss="sdfdf";
			StringBuilder kk="dfsf";
		*/
	}
}
