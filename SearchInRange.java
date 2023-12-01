package com.javalogist;

public class SearchInRange {

	public static void main(String[] args) {
		int[]nums = {10,40,2,14,66,7};
		int target = 10;
		System.out.println(linearSearch(nums,target,1,4));
	}
	
	static int linearSearch(int[] arr, int target,int start, int end) {
		if(arr.length==0)
			return -1;
		for(int index=start; index<end;index++) {
			int element = arr[index];
			
			if(element == target)
				return index;
		}
		return -1;
	}
	
}
