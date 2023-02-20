package readjsonfromfile;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParseJsonFromFile {
	
	
	
	@Test
	public void createUserFromFile() throws IOException
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
	String response	= given().header("Content-Type", "application/json")
		.body(new String(Files.readAllBytes(Paths.get("F:\\Desktop\\VimanNagar\\May 21\\20AugustKatrajRestAssured\\JsonBody.txt"))) )
		.log().all()
		.when()
		.post("/user")
		.then()
		.log().all()
		.extract().response().asPrettyString();
	}
	
	

}
