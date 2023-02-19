package serializeanddeserialize;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.RequestBody;

import static io.restassured.RestAssured.*;

public class CreateUser {
	
	@Test
	public void createUser()
	{
		RequestBody requestbody = new RequestBody();
		
		requestbody.setEmail("test@test1.com");
		
		requestbody.setFirstName("Edward");
		
		requestbody.setId(0);
		
		requestbody.setLastName("Pinto");
		
		requestbody.setPassword("Test@12345");
		
		requestbody.setPhone("9988776655");
		
		requestbody.setUsername("mredward");
		
		requestbody.setUserStatus(0);
		
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		given().log().all().header("Content-Type", "application/json")
		.body(requestbody)
		.when()
		.post("user")
		.then()
		.log().all()
		.extract()
		.response();
	}

}
