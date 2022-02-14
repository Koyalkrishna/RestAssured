package PraticeCRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void UpdateProject() {
		//step:1
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "koyal");
		jobj.put("projectName", "RA Framework");
		jobj.put("status", "Completed");
		jobj.put("teamSize", 15);
		
		//step:2
		
		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj);
		//step:3
		Response resp=req.put("http://localhost:8084/projects/TY_PROJ_001");
		
		//step:4
		
		ValidatableResponse validate=resp.then();
		validate.assertThat().statusCode(200);
		validate.log();
		
		
	}

}

