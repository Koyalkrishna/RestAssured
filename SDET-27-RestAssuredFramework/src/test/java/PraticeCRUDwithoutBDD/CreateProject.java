package PraticeCRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	
	@Test
	public void CreateProject() {
		//step:1 create test data
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "koyal");
		jobj.put("projectName", "RA Framework");
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);
		
		//step:2  provide request specification
		
		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj);
		
		//step:3  perform the action
		
		Response resp=req.post("http://localhost:8084/addproject");
		
		//step:4  print in console and action
		
		System.out.println(resp.asString());
		System.out.println(resp.prettyPrint());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.getContentType());
		
		
		
		
	}

}
