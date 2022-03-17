package ApiTesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

import org.testng.annotations.Test;

public class SingleUser {
      
	@Test
     public void Test(){
		
		given().
		 header("Content-Type", "application/json").
		 get("http://dummy.restapiexample.com/api/v1/employee/2").
		then().
		// statusCode(200).
		 body("data.id[1]", equalTo(2)).
		 body("data.employee_name", equalTo("Garrett Winters")).
		 body("data.employee_salary", equalTo("170750")).
		 body("data.employee_age",equalTo("63"));
		
	}
}
