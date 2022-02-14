package WaysToPostRequest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import PojoLibrary.PojoClass;
import io.restassured.http.ContentType;

public class CreateAResourceUsingPojo {
	@Test
	public void create() {
		PojoClass pojo=new PojoClass("koyal krishna","resource framework","completed",300);
		
		given()
		.body(pojo)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
