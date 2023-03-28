package com.java.practice1;

public class Pattern2 {
	
	public static void main(String []args){
		
		
		  /*12345
			2345
			345
			45
			5*/
		
		/*for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	        }*/
		
//------------------------------------------------------------------------
	  /*1
		12
		123
		1234
		12345*/
		
		     /*int i;int j;
		 
		     for( i=1;i<=5;i++) {
			
			    for(j=1;j<=i;j++){
				 
				System.out.print(j);
			         }
				
			System.out.println();
			}
		}
//----------------------------------	
    */
	
  /*   *
    * *
   * * * */
    
		
	    /*   1 
		    1 2 
		   1 2 3 
		  1 2 3 4 
		 1 2 3 4 5 */

//-------------------------------------------------------------------
	int n=5;
		for(int k=1;k<=n;k++)  {
			
	for(int i=k;i<=n;i++)
	{
		 System.out.print(" ");  }
	
	
	      
	       
	       
	for(int j =1;j<=k;j++) // inner loop for number of columns
	{
		System.out.print(j+" " ); // print star
	}
	System.out.println(); 
	
		}
		
// Daimond 
		//System.out.println("Dimond");
/*int n=5;
		for(int k=n-1;k>=1;k--)  {
			for(int i=k;i<=5;i++)
			{
				 System.out.print(" ");  }
			
			for(int j =1;j<=k;j++) // inner loop for number of columns
			{
				System.out.print(j+" " ); // print star
			}
			System.out.println(); 
			
				}*/
		
	//	
		
}
	
		 
	


}
