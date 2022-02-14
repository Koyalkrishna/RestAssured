package PraticeCRUDwithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateResourse {
	@Test
	public void create() {
		JSONObject jobj = new JSONObject();
		
		jobj.put("createdBy", "koyal");
		jobj.put("projectName", "RA Framework123");
		jobj.put("status", "Created");
		jobj.put("teamSize", 16);
		
		
		
	  }
	}

		


