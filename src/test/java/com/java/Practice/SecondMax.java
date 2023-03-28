package com.java.Practice;

 
import java.util.Arrays;

public class SecondMax {

	public static void main (String args[]){
		int temp = 0;
		int a[]={15,34,54,5,5,435,234,55,57};
		
		int n=a.length;
		
	/* Arrays.sort(a);
	  System.out.println(a[n-2]);*/
	 
	 for(int i=0;i<n;i++)
	 {
		 for  (int j=i+1;j<n;j++)
		 {
			 if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }
		 }
	 }
	 System.out.println("Second Max " +a[n-2]);
	 System.out.println("Max "+a[n-1]);
		
		
		
	 
	}

	 
}
