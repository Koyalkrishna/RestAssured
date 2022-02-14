package ResponseValidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidation {
	@Test
	public void verify() {
		String expectedProjectName="RA Framework";
		Response response=when()
				.get("http://localhost:8084/projects");
		String actualProjectName=response.jsonPath().get("[0].projectName");
		response.then()
			.assertThat()
			.contentType(ContentType.JSON).and().statusCode(200)
			.log().all();
		Assert.assertEquals(expectedProjectName,actualProjectName);
				
	}

}
