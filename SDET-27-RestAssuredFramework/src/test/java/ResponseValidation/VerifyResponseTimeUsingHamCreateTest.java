package ResponseValidation;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
public class VerifyResponseTimeUsingHamCreateTest {
	@Test
	public void verify() {

		
		 when()
			.get("http://localhost:8084/project")
		.then()
			.assertThat().time(Matchers.lessThan(5L),TimeUnit.MICROSECONDS)
			.log().all();
		
	}

	//private Object when() {
		// TODO Auto-generated method stub
		//return null;
	}
	


