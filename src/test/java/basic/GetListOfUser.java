package basic;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetListOfUser {
	
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		 Response response = given()
				 
		
		.when()
		.get("api/users?page=2")
		.then()
		.log().all().extract().response();
		
		 
		int statuscode= response.statusCode();
		
		System.out.println(statuscode);
		
	System.out.println(response.asPrettyString());	
	}

}
