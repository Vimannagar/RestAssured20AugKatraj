package complexjson;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import jsonstring.JsonContainer;

public class JsonFileValidation {
	
	
	@Test(priority = 1)
	public void getPurchaseAmount()
	{
		JsonPath js = new JsonPath(JsonContainer.sampleJson());
		
		int purchasevalue= js.getInt("dashboard.purchaseAmount");
		System.out.println(purchasevalue);
	}
	
	
	@Test(priority = 2)
	public void getCourseCount()
	{
		JsonPath js = new JsonPath(JsonContainer.sampleJson());
		
		int coursecount = js.getInt("courses.size()");
		
		System.out.println(coursecount);
	}
	
	
	@Test(priority = 3)
	public void getfirstCourseTitle()
	{
		JsonPath js = new JsonPath(JsonContainer.sampleJson());
		
		String titleoffirstcourse = js.getString("courses[0].title");
		
		System.out.println(titleoffirstcourse);
	}
	
	
	@Test(priority = 4)
	public void getCourseTitleWithPrice()
	{
		JsonPath js = new JsonPath(JsonContainer.sampleJson());
		
		int coursecount = js.getInt("courses.size()");
		
		for(int i=0; i<coursecount; i++)
		{
		
		String titleofcourse = js.getString("courses["+i+"].title");
		
		int courseprice = js.getInt("courses["+i+"].price");
		
		System.out.println(titleofcourse+" : "+courseprice);
		
		
		
	}
	}
		
		
		@Test(priority = 5)
		public void getCourseCopies()
		{
			JsonPath js = new JsonPath(JsonContainer.sampleJson());
			
			int coursecount = js.getInt("courses.size()");
			
			for(int i=0; i<coursecount; i++)
			{
				String titleofcourse = js.getString("courses["+i+"].title");
				if(titleofcourse.equals("RestAssured"))
				{
					int copiescount = js.getInt("courses["+i+"].copies");
				System.out.println(copiescount);
				}
			
			}
			
		}

}

