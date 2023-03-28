package com.java.practice1;

public class ReverseString {
	public static void main (String args[]){
		
		String s ="Abcd efgh ijkl";
		String reverse="";
		
		int i=s.length();
		
		System.out.println(i);
		
		for(int j=i-1;j>=0;j--)
		{
			reverse=reverse+s.charAt(j);
		}
		System.out.println(reverse);
		
		 String my="Mysore";
		  StringBuilder rev = new StringBuilder(my);
	  StringBuilder str = rev.reverse();
		  System.out.println(str);
	}

}
