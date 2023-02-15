package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleUser {

	@Test
	public void getUser() {
		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification httprequest = RestAssured.given();

		Response response = httprequest.request(Method.GET, "/api/users/2");

		String resp = response.asPrettyString();

		System.out.println(resp);

	}

}
