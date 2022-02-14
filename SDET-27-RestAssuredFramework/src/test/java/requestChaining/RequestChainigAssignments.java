package requestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoLibrary.PojoClass;

import static io.restassured.RestAssured.*;

public class RequestChainigAssignments {
@Test

public void createPost() {
	
	
	
	JSONObject jobj = new JSONObject();
	
	jobj.put("createdBy", "koyal");
	jobj.put("projectName", "RA Framework123");
	jobj.put("status", "Created");
	jobj.put("teamSize", 16);
	
	given()
	.pathParam("projectId","TY_PROJ_004")
.when()
	.delete("http://localhost:8084/projects/{projectId}")
.then()
	.assertThat().statusCode(204)
	.log().all();
	
	
	
	
	
}

}
