package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ParameterTest {
	@Test
	public void param() {
		given()
			.param("projectID", "TY_PROJ_001")
		.when()
			.delete("http://localhost:8084/projects/{projectId}")
		.then()
			.log().all();
	}

}
