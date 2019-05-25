package Recursion;

public class Sequence {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5}; //assumption --> the sequence is an increasing sequence
		System.out.println(checkInSequence(arr));
	}
	//Itertive solution  with Time complexity O(n) since only one loop running
/*	public static boolean checkInSequence(int arr[]) {
		int len = arr.length;
		if(len == 0) {
			System.out.println("Array is empty");
			return false;
		}
		if( len == 1) {
			return true;
		}
		for (int i=0; i<len; i++) {
			if(i == len-1) {
				break;
			}
			if (arr[i] != arr[i+1]-1) {
				return false;
			}
		}
		return true;
	}
*/

	
	//recursive solution with time complexity O(n)
/*	public static boolean checkInSequence(int arr[]) {
		int len = arr.length;
		if( len == 0) {
			System.out.println("Array is empty");
			return false;
		}
		else if(len == 1) {
			return true;
		}
		return inSequence(arr, 0);
	}	
	
	public static boolean inSequence(int arr[], int i) {
		if (i == arr.length-1) {
			return true;
		}
		return arr[i] == arr[i+1]-1 && inSequence(arr,i+1);  
	}	
	
*/	
	
	//recursive solution with time complexity O(logn)
	public static boolean checkInSequence(int arr[]) {
		int len = arr.length;
		if( len == 0) {
			System.out.println("Array is empty");
			return false;
		}
		else if(len == 1) {
			return true;
		}
		return inSequence(arr,0,len-1);
	}
	
	public static boolean inSequence(int arr[], int left, int right) {
		int mid = left+ (right - left) /2;
		boolean flag1 = false;
		boolean flag2 = false;
		if(left == right) {
			return true;
		}
		if(left == mid) {
			if(arr[mid] == arr[mid+1]-1) {
				return true;
			}
			else {
				return false;
			}
		}
		if(arr[mid] == arr[mid+1]-1) {
			flag1 = true; 
		}
		if(arr[mid] == arr[mid-1]+1) {
			flag2 = true;
		}
		return flag1 && flag2 && inSequence(arr, left, mid-1) && inSequence(arr, mid+1, right);
	}
	
	
}
