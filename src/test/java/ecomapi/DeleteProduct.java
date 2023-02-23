package ecomapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteProduct extends BaseTest {
	

	@Test
	public void addProduct()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		given()
		.header("Content-Type", "application/json")
		.header("Authorization", token);
		
		
		
	}

}
