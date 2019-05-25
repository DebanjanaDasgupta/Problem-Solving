package Recursion;

public class MaxInteger {
	public static void main(String args[]) {
		int arr[] = {0,-9,-2,-1};
		int maxInt;
		try {
			maxInt = maxElement(arr);
			System.out.println("Maximum integer in array is: "+maxInt);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static int maxElement(int arr[]) {
		int len = arr.length;
		if (len == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int i = len-1;
		return maximum(arr,i);
	}
	
	public static int maximum(int arr[], int i) {
		if(i == 0) {
			return arr[0];
		}
		return Math.max(arr[i], maximum(arr,i-1));
	}
}
