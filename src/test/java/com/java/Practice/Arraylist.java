package com.java.Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<String >ar=new ArrayList<String>();
		
ar.add("ashok");
ar.add("reddy");
System.out.println(ar);

Iterator<String> it1 = ar.iterator();
while(it1.hasNext()){
	
	if(it1.next().equalsIgnoreCase("reddy"))
	{
		System.out.println("Good job");
	}
}
 
ArrayList<String> ar2=new ArrayList<String>();
ar2.addAll(ar);

System.out.println(ar2);
 

	}

}
