package ecomapi;

import org.testng.annotations.Test;

import ecompojo.LoginRequest;
import ecompojo.LoginResponse;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Login {
	
	
	@Test
	public void loginToApp()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		LoginRequest loginrequest = new LoginRequest();
		
		loginrequest.setUserEmail("gouravjawale28@gmail.com");
		
		loginrequest.setUserPassword("Test@1234");
		
		
		
		
LoginResponse loginresponse = given()
		.header("Content-Type", "application/json")
		.body(loginrequest)
		.when()
		.post("/api/ecom/auth/login")
		.then()
		.extract()
		.response().as(LoginResponse.class);

String tokenvalue = loginresponse.getToken();

System.out.println(tokenvalue);

		

		
	}

}
