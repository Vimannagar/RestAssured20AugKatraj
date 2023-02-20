package serializeanddeserialize;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.RequestBody;
import pojo.ResponseBody;

import static io.restassured.RestAssured.*;

public class CreateUser {
	
	@Test
	public void createUser()
	{
		RequestBody requestbody = new RequestBody();
		
		requestbody.setEmail("test@test2.com");
		
		requestbody.setFirstName("Jack");
		
		requestbody.setId(0);
		
		requestbody.setLastName("Douglous");
		
		requestbody.setPassword("Test@12345");
		
		requestbody.setPhone("9988766655");
		
		requestbody.setUsername("mrdouglous");
		
		requestbody.setUserStatus(0);
		
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		ResponseBody responsebody= given().log().all().header("Content-Type", "application/json")
						.body(requestbody)
						.when()
						.post("user")
						.then()
						.log().all()
						.extract()
						.response().as(ResponseBody.class);
		
		int statuscode = responsebody.getCode();
		System.out.println(statuscode);
		
		String messagevalue = responsebody.getMessage();
		System.out.println(messagevalue);
		
		
	}

}
