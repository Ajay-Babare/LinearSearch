package com.javalogist;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{23,5,86},
				{8,56,},
				{66,78,69,3}
		};
		int target = 69;
		int[] result = search(arr,target);
		System.out.println(Arrays.toString(result));
		System.out.println("Max Value "+findMax(arr));
		System.out.println("Min Value "+findMin(arr));
	}
	static int[] search(int[][] arr,int target) {
		for(int row=0; row<arr.length;row++) {
			for(int col=0; col<arr[row].length;col++) {
				if(arr[row][col]==target)
					return new int[] {row, col};
			}
		}
		return new int[] {-1, -1};
	}
	static int findMax(int[][]arr){
		int max=Integer.MIN_VALUE;
		for(int[] ints:arr) {
			for(int element : ints) {
				if(element>max)
					max=element;
			}
		}
		return  max;
	}
	static int findMin(int[][]arr){
		int min=Integer.MAX_VALUE;
		for(int[] ints:arr) {
			for(int element : ints) {
				if(element<min)
					min=element;
			}
		}
		return  min;
	}
}
