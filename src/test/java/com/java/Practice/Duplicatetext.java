 package com.java.Practice;

public class Duplicatetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int count=1;
		 String st="Great responsibility";
		
		  char star[] = st.toCharArray();
		  
		int n=star.length;
		
		for(int i = 0; i <star.length; i++) {    
            count = 1;    
            for(int j = i+1; j <star.length; j++) {    
                if(star[i] == star[j] && star[i] != ' ') {    
                    count++;    
                    //Set star[j] to 0 to avoid printing visited character    
                    star[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && star[i] != '0')    
                System.out.println(star[i]);   
			
			
		}*/ 
		int count=1;
		 String str = "Ashook reddy Reddy Vaijinath reddy";
		  
		   char[] strar = str.toCharArray();
		   
		   for(int i=1;i<strar.length;i++){
			   count=1;
			   for(int j=i+1;j<strar.length;j++){
				   if(strar[i]==strar[j]&& strar[j]!= ' '){
					   count++;
					   
				   }
			   }
			   
			   if(count>1 && strar[i] != '0'){
				   System.out.println("Duplicate array "+strar[i]);
			   }
		   }
	}

}
