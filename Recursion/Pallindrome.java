//Check if a string is pallindrome or not using Recursion
package Recursion;

public class Pallindrome {
	public static void main(String args[]) {
		String str = "abdeedba";
		System.out.println(checkPal(str));
	}
	
	public static boolean checkPal(String str) {		
		
		if(str == null || str.isEmpty()) {
			System.out.println("String is null or empty");
			return false;
		}
		int len = str.length();
		
		//iterative 
	/*	for(int i = 0, j = len-1; i<len && j>=0; i++,j--) {
			if( str.charAt(i) != str.charAt(j) ) {
				return false;
			}
			if(i >= j) {
				break;
			}
		}
		return true;
	*/
		
		//recursive
		return isPal(str,0,len-1);
		
	}
	
	public static boolean isPal(String str, int i, int j) {
		if(i >= j) {
			return true;
		}
		return str.charAt(i) == str.charAt(j) && isPal(str,i+1,j-1);		
	}	
	
	
}
