package com.java.practice1;

public class Polyndrome {

	public static void main(String[] args) {
		 
		
		String s="MADAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
			if (rev.equals(s)){
				System.out.println("Is Palindrome");
			}
			else {
				System.out.println("Not an Palindrome");
			}

			String revv="";
			String str ="abcd efgh ijkl";
			String[] nn = str.split(" ");
			int k=nn.length;
			
			for (int i=0 ;i<=k-1;i++){
		
			StringBuilder sb=new StringBuilder(nn[i]);
			  
			  revv+=sb.reverse().toString()+" ";
			}
			System.out.println(revv);
	}

}
