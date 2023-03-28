package com.java.Practice;

import java.util.HashMap;

public class Hasmap {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		HashMap<String, Integer> hs=new HashMap<>();
	/*	
		hs.put("Maharastra", 1);
		
		hs.put("Karnataka",  2);
		hs.put("Kerala", 3);
		
		for(String a : hs.keySet()){
			System.out.println("Key : " + a +" it's values : "+hs.get(a));
		}*/
		
		
		
		hs.put("British", 1);
		hs.put("Telecome", 2);
		for(String a:hs.keySet())
		{
			 System.out.println("Key : " +a+ " value : "+hs.get(a));
		}
		

	}

}
