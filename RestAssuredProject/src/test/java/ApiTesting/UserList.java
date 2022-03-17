package ApiTesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class UserList {

	@Test
	public void Test_01(){
		
		given().
		 header("Content-Type", "application/json").
		 get("http://dummy.restapiexample.com/api/v1/employees").
		then().
		 statusCode(200).
		 body("data.id[1]", equalTo(2)).
		 body("data.employee_name", hasItems("Tiger Nixon","Ashton Cox"));

	}
}
