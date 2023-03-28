package com.java.practice1;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   /*5
		 4 5
		 3 4 5
		 2 3 4 5
		 1 2 3 4 5*/
		
		
		
		
		for(int i=5;i>=1;i--){
			
			for(int j=i;j<=5;j++)                                          
			{
				System.out.print(" "+j);
			}
             System.out.println();
		}
	}

}
