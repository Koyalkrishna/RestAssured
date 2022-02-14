package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameterTest {
	@Test 
	public void param() {
		
		
		given()
			.queryParams("page","2")
		.when()
			.get("http://reqres.in/api/users")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
	

}
