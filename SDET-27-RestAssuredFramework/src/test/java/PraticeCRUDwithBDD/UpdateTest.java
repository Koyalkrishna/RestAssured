package PraticeCRUDwithBDD;

import java.util.Random;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateTest {
	@Test
	public void Update() {
		
		
		Random ran=new Random();
		int randomNumber=ran.nextInt(500);
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "koyal");
		jobj.put("projectName", "RA Framework");
		jobj.put("status", "Created");
		jobj.put("teamSize", 450);
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
		.when()
			.put("http://localhost:8084/projects/TY_PROJ_001")
		.then()
			.assertThat().contentType(ContentType.JSON)
			.statusCode(200)
			.log().all();
			
		
		
	}

}
