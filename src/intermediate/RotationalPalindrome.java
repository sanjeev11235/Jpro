package intermediate;

public class RotationalPalindrome {

	
	public static void main(String[] args) {
		
		String[] arr=splitAString("Hello How Are You",' ');
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static String[] splitAString(String abc, char splitWith) {
		
		char[] ch=abc.toCharArray();
		String temp="";
		int j=0,length=0,size=0;
		for(int i=0;i<abc.length();i++) {
			if(splitWith==abc.charAt(i)) {
				size++;
			}
		}
		String[] arr=new String[size+1];
		for(int i=0;i<ch.length;i++) {
			if(length > j) {
				j++; 
				temp="";
			}
			if(splitWith == ch[i]) {
				length++;
			}else {
				temp +=Character.toString(ch[i]);
			}
			arr[j]=temp;
			
		}
		return arr;
	}
}
