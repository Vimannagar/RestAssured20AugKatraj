package petstore;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import jsonstring.JsonContainer;

public class MultiRequestWithSpecBuilder {
	
	@Test
	public void createUser()
	{
RequestSpecification req = new RequestSpecBuilder()
		 				.setBaseUri("https://petstore.swagger.io/v2")
		 				.setContentType(ContentType.JSON)
		 				.build();

	

	RequestSpecification request = given().log().all().spec(req).body(JsonContainer.createUserBody());

	 ResponseSpecification resspec = new ResponseSpecBuilder()
			 							.expectStatusCode(200)
			 							.expectContentType(ContentType.JSON)
			 							.build();
	
Response response = request.when()
	.post("user")
	.then()
	.spec(resspec)
	.log().all()
	.extract()
	.response();

String resp = response.asPrettyString();

System.out.println(resp);
	}

}
