package basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jsonstring.JsonContainer;

public class POST_CreateUserModified {
	
	static int message;
	
	@Test(priority = 1)
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification httprequest = RestAssured.given();
		
		httprequest.header("Content-Type", "application/json");
		
		httprequest.body(JsonContainer.createUserBody());

		Response response = httprequest.request(Method.POST, "/user");

		String stringresponse = response.asPrettyString();

		System.out.println(stringresponse);
		
		message = response.jsonPath().getInt("message");
		
		System.out.println(message);
		
	
	}
	
	@Test(priority = 2)
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET, "/user/katraj21august");
		
		System.out.println(response.asPrettyString());
		
		int idvalue= response.jsonPath().getInt("id");
		
		
		Assert.assertEquals(idvalue, message);

		
		
		
	}
	
	
	

}
