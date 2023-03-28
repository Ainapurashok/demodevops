package com.java.practice1;

public class FibonaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=0,k=1, j;
		
		System.out.println(i);
		System.out.println(k);
	for(int l=1;l<=10;l++){	
		j=k+i;
		
		i=k;
		k=j;
		System.out.println(j);
	}
		
	}

}


//0 1 1 2 3 5 