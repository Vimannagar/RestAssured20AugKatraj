package basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_ListOfUsers {
	
	
	@Test
	public void getList()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET, "/api/users?page=2");
	
		String stringresponse = response.asPrettyString();
		
		System.out.println(stringresponse);
		
		int scode = response.statusCode();
		
		System.out.println(scode);
		
		int pagevalue = response.jsonPath().getInt("page");
		
		System.out.println("page value is : "+pagevalue);
	
		Assert.assertEquals(scode, 200);
	}

}
