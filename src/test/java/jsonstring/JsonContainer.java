package jsonstring;

public class JsonContainer {
	
	
	public static String createUserBody()
	{
		String s = "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"katraj21august\",\r\n"
				+ "  \"firstName\": \"Test\",\r\n"
				+ "  \"lastName\": \"Engg\",\r\n"
				+ "  \"email\": \"katraj21august@gmail.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"1234567892\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
		
		return s;
	}
	
	public static String sampleJson()
	{
		String s = "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"www.google.com\"\r\n"
				+ "},\r\n"
				+ "\"courses\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"Selenium webdriver with java\",\r\n"
				+ "\"price\": 50,\r\n"
				+ "\"copies\": 6\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"RestAssured\",\r\n"
				+ "\"price\": 40,\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"BDD with cucumbber\",\r\n"
				+ "\"price\": 45,\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		return s;
	}
	
	

}
