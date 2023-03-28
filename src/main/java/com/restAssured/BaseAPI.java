package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
 
import static org.hamcrest.Matchers.*;
public class BaseAPI {

	public static void main(String[] args) {
     //Post call 
		
		final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
		final String USERNAME = "TOOLSQA-Test";
		final String PASSWORD = "Test@@123";
		final String BASE_URL = "https://bookstore.toolsqa.com";

		String token;
		Response response;
		
		
		
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given().log().all();

		request.header("Content-Type", "application/json");
		 response = request.body("{ \"userName\":\"" + USERNAME + "\","
		 		+ " \"password\":\"" + PASSWORD + "\"}").when().
				post("/Account/v1/GenerateToken");
	  

		String jsonString = response.asString();
		token = JsonPath.from(jsonString).get("token");
		 System.out.println("token is "+token);
		 response.then().log().all();
		 
		 //response = 
				 String re = request.body("{ \"userName\":\"" + USERNAME + "\","
			 		+ " \"password\":\"" + PASSWORD + "\"}").when().
					post("/Account/v1/GenerateToken").then().log().all().assertThat().statusCode(200)
					 .body("result",equalTo("User authorized successfully."))
		 .extract().asString();
				
				 JsonPath jsp = new JsonPath(re);
			  String token1 = jsp.getString("token");
			  System.out.println(" Token Is ### " +token1);
				 
		//js.toString().ge
		
		 /*request.body("{ \"userName\":\"" + USERNAME + "\", \"password\":\"" + PASSWORD + "\"}")
		 
		 .when().post("/Account/v1/GenerateToken").then().log().all();*/
		 
		
		/*RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("Key", "qaclick123").header("Content-Type","application/json")
		
		.body("{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Frontline house\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"").when().post("/maps/api/place/add/json").then().log().all().assertThat()
		.statusCode(200);
		
		
		
*/
			  
			  
			  given().get("https://reqres.in/api/users?page=2").then().log().all().statusCode(200).body("data.id[0]", equalTo(7));
	}

}
