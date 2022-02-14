package sdet27_GenericUtility;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * this class contains generic methods to connect to database
 * @author USER
 *
 */

public class DatabaseUtility {
	Connection con=null;
	//step1:register the database------1 
	//step2:get connection with database----1
	//step3:issue create statement------2
	//step4:execute query------2
	//step5:close connection-------3
	
	/**
	 * this method will establish connection with database
	 * @throws Throwable
	 */
	public void connectToDatabase()throws Throwable  {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		Connection con =DriverManager.getConnection(IConstants.dbURL,IConstants.dbUserName,IConstants.dbPassword);
		
		
		
	}
	
	
	
	/**
	 * This method will close the database connection
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException 
	 * @throws Throwable
	 */
	public String executeQueryAndGetData(String query,int columnIndex,String expData) throws SQLException {
		boolean flag=false;
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next())
		{
			String value=result.getString(columnIndex);
			if(value.equalsIgnoreCase(expData)) {
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(expData+"Data verified");
			return expData;
		}
		else {
			System.out.println("data not present");
			return "";
	}

	}

	
	
	/**
	 * this method will close the database connection
	 * @throws Throwable
	 */
	public void closeDB() throws Throwable
	{
		con.close();
	}

}



