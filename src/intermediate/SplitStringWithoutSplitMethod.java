package intermediate;

public class SplitStringWithoutSplitMethod {


	private static String[] splitString(String string, char del) {
		
		char[] ch=string.toCharArray();
		String temp="";
		int j=0,length=0,size=0;
		
		for(int i=0;i<string.length(); i++) {
			if(del==string.charAt(i)) {
				size++;
			}
		}
		System.out.println(size);
		String[] arr=new String[size+1];
		for(int i=0;i<ch.length;i++) {
			if(length > j) {
				j++;
				temp="";
			}
			if(del==ch[i]) {
				length++;
			}
			
			else {
				temp +=Character.toString(ch[i]);
			}
			arr[j]=temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		String [] arr=splitString("how are you",' ');
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
