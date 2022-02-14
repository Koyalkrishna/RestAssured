package PraticeCRUDwithoutBDD;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	@Test
	public void deleteProject() {
		//step:1
		int expStatus=204;
		Response resp=RestAssured.delete("http://localhost:8084/projects/TY_PROJ_001");
		//step:2
		
		int actStatus=resp.getStatusCode();
		Assert.assertEquals(expStatus, actStatus);
		System.out.println(resp.prettyPrint());
	}
}
