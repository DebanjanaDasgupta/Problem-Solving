/*
 * Problem: Check if the expression containing same type of brackets is valid or not
 * Input: ()()() Output: Valid
 * Input: ()(() Output: Invalid
 * Input: (((()(())))) Output: Valid
 */
 
import java.util.*;

public class MatchingBrackets {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the expression:");
		String str = sc.next();
		int left = 0; 
		int flag = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				left++;
			}
			if(str.charAt(i) == ')') {
				if(left <= 0) {
					System.out.println("Invalid Expression");
					flag = 1;
					break;
				}
				else {
					left--;
				}
			}
		}
		if(left != 0) {
			System.out.println("Invalid Expression");
		}
		else if(flag != 1)
		{
			System.out.println("Valid Expression");
		}
		
	}
}
