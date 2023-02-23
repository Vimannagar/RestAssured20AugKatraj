package ecomapi;

public class JsonBody {
	
	
	public static String placeOrderBody(String prdid)
	{
		String s = "{\"orders\": [\r\n"
				+ "        {\r\n"
				+ "        \"country\": \"India\", \r\n"
				+ "        \"productOrderedId\" : \""+prdid+"\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		return s;
	}

}
