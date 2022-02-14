package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {
	@Test
	public void verify() {
		String expectedProjectName="RA Framework";
		Response response=when()
				.get("http://localhost:8084/projects");
		List<String> pronames=response.jsonPath().get("projectName");
		boolean flag=false;
		for(String pNames:pronames) {
			if(pNames.equals(expectedProjectName)) {
				flag=true;
			}
			
		}
		Assert.assertEquals(flag, true);
	}
}
