package com.java.Practice;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,34,56,78,98,23,45,65};
		int max = 0;
		
		//max=a[0];
		
		for(int j=0;j<a.length;j++){
		
		for(int i=1;i<=a.length-1;i++)
		{
			
			if(a[j]>a[i]){
				
				 max=a[j];
				 a[j]=a[i];
				 a[i]=max;
				
			}
			
		
		}
		
			 
		
	}
		System.out.println("Max number is "+ a[a.length-3]);
}}
