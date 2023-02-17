package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_CreateUser {
	
	
	@Test
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification httprequest = RestAssured.given();
		
		httprequest.header("Content-Type", "application/json");
		
		httprequest.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"katraj20august\",\r\n"
				+ "  \"firstName\": \"software\",\r\n"
				+ "  \"lastName\": \"testing\",\r\n"
				+ "  \"email\": \"katraj@20august.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"9876543210\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}");

		Response response = httprequest.request(Method.POST, "/user");

		String stringresponse = response.asPrettyString();

		System.out.println(stringresponse);
		
		
		
	}

}
