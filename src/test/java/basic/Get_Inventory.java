package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Inventory {
	
	@Test
	public void getInventory()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		RequestSpecification httprequest = RestAssured.given();
		

		Response response = httprequest.request(Method.GET, "/store/inventory");
	
		String stringresponse = response.asPrettyString();
		
		System.out.println(stringresponse);
		
		int scode = response.statusCode();
		
		
		
		System.out.println(scode);
	}

}
