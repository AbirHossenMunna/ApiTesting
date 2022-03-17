package ApiTesting;

import static io.restassured.RestAssured.*;

public class DeleteUser {

	 public void Test01_Post(){
			
			when().
			  post("http://dummy.restapiexample.com/api/v1/delete/2").
			then().
			  statusCode(200).
			  log().all();		
					
		}
}
