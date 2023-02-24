package ecomapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteProduct extends BaseTest {
	

	@Test
	public void addProduct()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
String response = given()
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.pathParam("productid", productId)
		.when()
		.delete("/api/ecom/product/delete-product/{productid}")
		.then()
		.log().all()
		.extract().response().asPrettyString();
		
		
		
		
	}

}
