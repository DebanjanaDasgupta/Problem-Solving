//Given an integer, write a recursive function to return the sum of it's digits
package Recursion;

public class SumOfDigits {
	public static void main(String args[]) {
		int input = 189;
		System.out.println("Sum of digits: "+digitSum(input));
	}
	
	public static int digitSum(int num) {		
		int sum = 0;
		
		// iterative
	/*	while(num>0) {
			sum = sum+(num%10);
			num = num/10;
		}
		return sum;
	*/
		//recursive solution
		return calcSum(sum,num);		
	}
	
	public static int calcSum(int sum, int num) {
		if(num <= 0) {
			return sum;
		}
		return calcSum(sum + (num%10),num/10);
	}
}
