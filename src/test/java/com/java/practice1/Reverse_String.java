package com.java.practice1;/*>}*/






import java.util.Scanner;
import java.util.StringTokenizer;


public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner st = new Scanner(System.in);
		 System.out.println("Add string which like to revrese");
		 String reverse="";
		 String s=st.nextLine();
		 int i=s.length();
		 System.out.println(i);
		 
		  for(int j=i-1;j>=0;j--)
		     {
	  reverse=reverse+s.charAt(j);
		     }
		 System.out.print("Revrese String is :"+reverse);
		 
		 if(s.equalsIgnoreCase(reverse)){
			 System.out.println("It's palindrome");
		 }
		 
		 /*StringBuilder sb=new StringBuilder(s);
		  StringBuilder stt = sb.reverse();
		 
		 System.out.println("  Original String "+stt );*/
			 
		 
		/*String rev="";
		String sg="abcd efgh ijkl mnop";
		StringTokenizer sk=new StringTokenizer(sg," ");
		   while(sk.hasMoreTokens()){
			StringBuilder sbb=new StringBuilder(sk.nextToken());   
		     StringBuilder revv = sbb.reverse();
		          rev=rev+" "+revv;
		     }
		   System.out.println("rev "+rev+" ");*/
		
		
		//#######Split the String and Print  ######### #
		
		/*String rev =""; 
		String rev1="";
		String str = "ashok reddy vaijinath reddy";
		
		String[] st = str.split(" ",4);
		
		int n=st.length;
		System.out.println(n);
		
		for(String a:st)
		{
			System.out.println(a);
			char ar[]=a.toCharArray();
			for(int i=ar.length-1;i>=0;i--){
				 rev=rev+ar[i];
				 
			    }
			rev1=rev+" ";
			   
			//rev=rev+a;
			
		}
		System.out.println(rev1);
		//System.out.println(rev);
*/		
		
		
	}

}
