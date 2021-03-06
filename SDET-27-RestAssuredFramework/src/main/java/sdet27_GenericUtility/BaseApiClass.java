package sdet27_GenericUtility;

import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseApiClass {
	public DatabaseUtility dLib = new DatabaseUtility();
	public JavaUtility jLib = new JavaUtility();
	public RestAssuredUtility rLib = new RestAssuredUtility();
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	{
		baseURI = "http://localhost";
		port = 8084;
		
		dLib.connectToDatabase();
		System.out.println("======>database Connection esatablised<======");
	}

	
	@AfterSuite
	public void asConfig() throws Throwable
	{
		dLib.closeDB();
		System.out.println("=======>database connection closed<====");
	}
	}
