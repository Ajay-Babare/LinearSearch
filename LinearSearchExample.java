package com.javalogist;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[]nums = {10,40,2,14,66,7};
		int target = 2;
		System.out.println(linearSearch3(nums,target));
	}
	
	static int linearSearch(int[] arr, int target) {
		if(arr.length==0)
			return -1;
		for(int index=0; index<arr.length;index++) {
			int element = arr[index];
			
			if(element == target)
				return index;
		}
		return -1;
	}
	
	static int linearSearch2(int[] arr, int target) {
		if(arr.length==0)
			return -1;
		for(int element : arr ) {	
			if(element == target)
				return element;
		}
		return -1;
	}
	
	static boolean linearSearch3(int[] arr, int target) {
		if(arr.length==0)
			return false;
		for(int element : arr ) {	
			if(element == target)
				return true;
		}
		return false;
	}
}
