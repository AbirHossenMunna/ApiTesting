package ApiTesting;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostCreate {
 
	@Test
	public void Test01_Post(){
		
		Map<String, Object>  map = new HashMap<String, Object>();
	    map.put("name", "Abir");
		map.put("salary","123012");
		map.put("age","28");
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		  header("Content-Type", "application/json").
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  post("http://dummy.restapiexample.com/api/v1/create").
		then().
		  statusCode(201);
		
		  
			
				
	}
}
