package ecomapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;



public class AddProduct extends BaseTest {
	
	@Test
	public void addProduct()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
String response= given()
		.header("Authorization", token)
		.param("productName", "Wrist watch")
		.param("productAddedBy", userid)
		.param("productCategory", "fashion")
		.param("productSubCategory", "watches")
		.param("productPrice", "1500")
		.param("productDescription", "Titan")
		.param("productFor", "men")
		.multiPart("productImage", new File("F:\\Desktop\\VimanNagar\\May 21\\20AugustKatrajRestAssured\\Watch.png"))
		.when()
		.post("/api/ecom/product/add-product")
		.then()
		.log()
		.all()
		.extract()
		.response()
		.asPrettyString();


		JsonPath js = new JsonPath(response);
		
		String prdid = js.getString("productId");
		
		productId = prdid;


		
		
		
	}

}
