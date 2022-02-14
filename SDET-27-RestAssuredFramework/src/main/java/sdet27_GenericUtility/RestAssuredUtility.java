package sdet27_GenericUtility;

import io.restassured.response.Response;

/**
 * This class contains generic methods specific to rest assured
 * @author USER
 *
 */

public class RestAssuredUtility {
	/**
	 * This method will return the json path specified
	 * @param resp
	 * @param jsonpath
	 * @return
	 */
public String getJSONData(Response resp,String jsonPath ) {
	
	String jsonData=resp.jsonPath().get(jsonPath);
	return jsonData;
}

}
