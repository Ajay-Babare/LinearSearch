package com.javalogist;

public class SearchInStrings {

	public static void main(String[] args) {
		String str = "Ajay";
		char target = 'y';
		System.out.println(search2(str,target));
	}
	
	static boolean search1(String str, char target) {
		if(str.length()==0)
			return false; 
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i) == target)
				return true;
		}
		
		return false;
	}
	
	static boolean search2(String str, char target) {
		if(str.length()==0)
			return false; 
		for (char ch : str.toCharArray()) {
			if(ch == target)
				return true;
		}
		
		return false;
	}
}
