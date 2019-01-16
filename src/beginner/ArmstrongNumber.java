package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {// Number is Armstrong Or Not
	
	private static boolean isArmstrong(int num) {
		
		int sum=0,temp=num;  //temp will hold reference to number.
		while(temp>0) {
			int rem=temp%10;
			sum+=(rem*rem*rem);
			temp=temp/10;
		}
		if(num==sum)
				return true;
		else
			return false;
	}
	public static void main(String arsg[]) throws NumberFormatException, IOException {
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		
		System.out.print("Enter Number to check is it Armstrong Or Not ");
		int num=Integer.parseInt(br.readLine());
		System.out.print(isArmstrong(num)? num+" Is Armstrong Number " : num+" Not Armstrong Number ");
	}
}
