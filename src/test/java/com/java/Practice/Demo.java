package com.java.Practice;

public class Demo {
	
	static final String employer="HM";
	       static String name;
	        int id;
	
	   static void display(){
	   //employer="Wipro";
		//name="vainath";
		
	}
	
	Demo(String name,int id){
		this.name=name;
		this.id=id;
	}
	
   void run(){
    	
    	System.out.println(name +" " +id+" "+ employer);
    	
    }
   
   public static void main(String arhs[]){
	   
	  Demo d=new Demo("ashok",123);
	  d.run();
   }

}
