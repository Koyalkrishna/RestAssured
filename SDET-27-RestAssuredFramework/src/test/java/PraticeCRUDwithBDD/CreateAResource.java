package PraticeCRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateAResource {
	@Test
	public void  CreateAResource() {
		
		Random ran=new Random();
		int randomNumber=ran.nextInt(500);
		
		JSONObject jobj=new JSONObject();
		
		jobj.put("createdBy", "koyal");
		jobj.put("projectName", "frame"+randomNumber);
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
			
		
		
	}
	

}
