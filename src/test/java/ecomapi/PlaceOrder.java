package ecomapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PlaceOrder extends BaseTest {
	
	@Test
	public void addProduct()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
String response= given()
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.body(JsonBody.placeOrderBody(productId))
		.log().all()
		.when()
		.post("/api/ecom/order/create-order")
		.then()
		.log()
		.all()
		.extract()
		.response()
		.asPrettyString();
		
		
	
	}
}
