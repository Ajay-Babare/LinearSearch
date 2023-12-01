package com.javalogist;

public class EvenDigits {

	public static void main(String[] args) {
		
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));

	}

	static int findNumbers(int[] nums) {
		int count=0;
		for(int ele: nums) {
			if(even(ele)) {
				count++;
			}
		}
		return count;
	}
	static boolean even(int element) {
		
			return digits(element)% 2==0;
	}
	static int digits(int num) {
		
		if(num<0)
			num=num*-1;
		
		if(num==0)
			return 1;
		
		int count=0;
		while(num>0) {
		count++;
		num/=10;
		}
		return count;
	}
}

