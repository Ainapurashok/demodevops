package com.java.practice1;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		System.out.println("Please Enter the number to check the number is prime or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println("Not an Prime number");
		}
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime Number");
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Prime Number");
		}

	}

}
