package com.restAssured;
import com.java.practice1.GivenoumberPrime;

import files.payload;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//System.out.println(js.toString();
		//Print No of courses returned by API
		 
		
		/*given().queryParam("key","value").header("","").body(payload.CoursePrice()).log()
		.all().when().post("123/456").then().log().all();*/
		
		String re = given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7))
		.extract().response().asString();
		
		System.out.println(re);
		
		JsonPath js1=new JsonPath(re);
		int nn=js1.getInt("data.size()");
		System.out.println(nn);
		
		
		String email1 = js1.getString("data.email[0]");
		String email2 = js1.getString("data[0].email");
		  System.out.println(email1);
		  System.out.println(email2);
		
		  
		JsonPath js=new JsonPath(payload.CoursePrice());
		
		/*given().queryParam("key","value").header("","").body(payload.CoursePrice()).log()
		.all().when().post("123/456").then().log().all();*/
		
int count=	js.getInt("courses.size()");
System.out.println(count);
//Print Purchase Amount
int totalAmount= js.getInt("dashboard.purchaseAmount");
System.out.println(totalAmount);
//Print Title of the first course


  String titleFirstCourse=js.get("courses[2].title");
  System.out.println(titleFirstCourse);
  
  //Print All course titles and their respective Prices
  
  for(int i=0;i<count;i++)
  {
	  String courseTitles=js.get("courses["+i+"].title");
	  System.out.println(js.get("courses["+i+"].price").toString());
	  
	  System.out.println(courseTitles);
	  
  }
  //Print no of copies sold by RPA Course
  
 System.out.println("Print no of copies sold by RPA Course");
 
 for(int i=0;i<count;i++)
 {
	  String courseTitles=js.get("courses["+i+"].title");
	  if(courseTitles.equalsIgnoreCase("RPA"))
	  {
		  int copies=js.get("courses["+i+"].copies");
		  System.out.println(copies);
		  break;
	  }
	
	  
 }
 
 
 
	}

}
