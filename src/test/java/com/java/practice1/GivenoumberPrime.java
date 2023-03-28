package com.java.practice1;

import java.util.Scanner;

public class GivenoumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i=2;i<=n/2;i++) {
		if(n%i==0){
			
			prime=1;
			 
			 break;
		}
		}
       if(prime==0)
			 
			System.out.println("Prime Number ");
       
       else System.out.println("Not an Prime");
		
				}
 
	}


