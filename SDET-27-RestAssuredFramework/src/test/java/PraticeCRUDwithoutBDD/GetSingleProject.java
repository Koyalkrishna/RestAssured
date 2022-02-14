package PraticeCRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	
	@Test
	public void GetSingleProject() {
		//step:1
		Response resp=RestAssured.get("http://localhost:8084/projects/TY_PROJ_003");
		
		//STEP:2
		
		System.out.println(resp.prettyPeek());
	}

}
