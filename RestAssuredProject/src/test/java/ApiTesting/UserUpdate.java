package ApiTesting;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class UserUpdate {
	
     public void Test01_Post(){
		

 		Map<String, Object>  map = new HashMap<String, Object>();
 	    map.put("employee_name", "Abir Hossen");
 		map.put("employee_salary", "2000000");
 		map.put("employee_age", "30");
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
		  post("http://dummy.restapiexample.com/api/v1/update/21").
		then().
		  statusCode(200).
		  log().all();		
				
	}
}
