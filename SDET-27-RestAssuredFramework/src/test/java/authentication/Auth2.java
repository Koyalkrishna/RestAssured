package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2 {	
	@Test
	public void auths() {
		
		Response response=given()
				.formParam("client_id","sdet--27")
				.formParam("client_secret", "6b3696ef1a65bc5ead03288358b0de24")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://exampl.com")
				
			
			.when()
				.post("http://coop.apps.symfonycasts.com/token");
			String token=response.jsonPath().get("access_token");
			
			
			given()
				.auth().oauth2(token)
				.pathParam("USER_ID", "2802")
			.when()
				.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
			.then()
			
			//response.then()
				.log().all();
				
	}
}
		



