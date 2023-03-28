package com.java.practice1;

 class Area {
	
	int length;
	int breadth;
	
	Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public void getArea(){
		
		int totalarea=length*breadth;
		System.out.println("Total Area =" + totalarea);
	}
}
	
	public class B {
		
		public static void main (String[] args){
			  Area ar = new Area(5,2);
			    ar.getArea();
		}
		
	}

