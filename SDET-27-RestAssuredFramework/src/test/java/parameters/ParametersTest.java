package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ParametersTest {
	@Test
	public void params() {
		given()
			.pathParam("Username", "koyal")
			.queryParam("sort", "created")
		.when()
			.get("https://api.github.com/users/{username}/repos")
		.then()
			.assertThat().statusCode(200)
			.log().all();
		
	}

}
