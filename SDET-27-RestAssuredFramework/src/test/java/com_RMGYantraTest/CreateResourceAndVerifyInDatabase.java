package com_RMGYantraTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import sdet27_GenericUtility.BaseApiClass;
import sdet27_GenericUtility.EndPoint;

import static io.restassured.RestAssured.*;

import PojoLibrary.PojoClass;

public class CreateResourceAndVerifyInDatabase extends BaseApiClass {
	@Test
	public void createResourceAndVerifyInDb() throws Throwable
	{
		//Step 1: create test data
		 PojoClass pLib = new PojoClass("koyal","happ"+jLib.getRandomNum(), "completed",77);
		
		//Step 2: execute post request
		Response resp = given()
						.body(pLib)
						.contentType(ContentType.JSON)
						.when()
						.post(EndPoint.CreateProject);
		
		//Step 3: capture the project id from response
		String expData = rLib.getJSONData(resp, "projectId");
		System.out.println(expData);
		
		//Step 4: verify in db
		String query = "select * from project;";
		String actData=dLib.executeQueryAndGetData(query, 1, expData);
		Reporter.log(actData,true);
		System.out.println();
		
		//Step 5: validate
		Assert.assertEquals(expData, actData);
		Reporter.log("data verification successful", true);
		
	}	

}
