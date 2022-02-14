package WaysToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateAResourceUsingHashMap {
	@Test
	public void Create() {
		HashMap map=new HashMap();
		
		map.put("createdBy", "koyal");
		map.put("projectName", "RA Framework");
		map.put("status", "Created");
		map.put("teamSize", 15);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	}
	

}
