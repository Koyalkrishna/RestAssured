package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BarrierTokenTest {
	@Test
	public void bearerAuth() {
		
		given()
			.auth().oauth2("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")
		.when()
			.get("https://api.github.com/orgs/{org}/repos")
		.then()
			.assertThat().statusCode(200)
			.log().all();
		
	}

}
