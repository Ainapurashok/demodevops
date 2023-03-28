package com.restAssured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payload;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	
	@Test(dataProvider="Bookdata")
	
	public void addbook(String isbn,String aisle){
		
		RestAssured.baseURI="http://216.10.245.166";
				//"";
		String resp = given().log().all().header("Content-Type","application/json").
				body(payload.addbook(isbn, aisle)).
				when()
		.post("/Library/Addbook.php").
		then().log().all().statusCode(200).extract().response().asString();
		
		JsonPath st = new JsonPath(resp);
		String id=st.getString("ID");
		System.out.println(id);
		
		
		
		
		
	}

	@DataProvider(name="Bookdata")
	public Object[][] getdata()
	{
		
		
		
		return new Object[][] {{"accc","1212"},{"abbb","4321"} };
	}
}
