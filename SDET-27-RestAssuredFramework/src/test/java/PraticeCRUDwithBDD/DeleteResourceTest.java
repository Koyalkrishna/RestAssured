package PraticeCRUDwithBDD;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DeleteResourceTest {
	@Test
	public void DeleteResourceTest() {
		
		int expStatus=204;
		Response resp=RestAssured.delete("http://localhost8084/projects/TY_PROJ_001");
		
		int actStatus=resp.getStatusCode();
		Assert.assertEquals(expStatus,actStatus);
		System.out.println(resp.prettyPrint());
		
		
		
	}

}
