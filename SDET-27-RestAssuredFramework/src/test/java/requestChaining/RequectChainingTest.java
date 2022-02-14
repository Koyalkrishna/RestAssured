package requestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequectChainingTest {
	@Test
	public void Chaining() {
		Response response=when()
				
			.get("http://localhost:8084/projects");
		String proID=response.jsonPath().getString("[0].projectId");
		
		given()
			.pathParam("projectId", proID)
		.when()
			.delete("http://localhost:8084/projects/{projectId}")
		.then()
			.assertThat().statusCode(204)
			.log().all();
		
		
	}

}
