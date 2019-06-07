/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.*;

public class TwoSumArr {
	
	public static void main(String args[]) {
		int arr[] = {2,5,7,11};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        
		 // Brute force:: O(n^2) solution
	     /*   for(int i = 0; i<nums.length; i++){
	            for(int j = i+1; j<nums.length; j++){
	                if(target == nums[i]+nums[j]){
	                    return new int[]{i,j};
	                }
	            }   
	        } 
	     */
		 
		 
	     // Optimized O(n) solution     
	        HashMap<Integer, Integer> table = new HashMap<>();
	        for(int i = 0; i<nums.length; i++){
	            table.put(nums[i],i);
	        }
	        for (int i=0; i<nums.length;i++){
	        	int comp = target - nums[i];
	            if(table.containsKey(comp) && table.get(comp) != i){
	                return new int[] {i, table.get(comp)};
	            }
	        }	            
	        return null;
	 }
}
