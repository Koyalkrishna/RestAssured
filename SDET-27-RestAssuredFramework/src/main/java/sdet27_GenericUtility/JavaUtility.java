package sdet27_GenericUtility;

import java.util.Random;

/**
 * This class contains java specific generic methods
 * @author USER
 *
 */

public class JavaUtility {
	/**
	 * This method will generate a random value for every run
	 */
	public int getRandomNum() {
		
		Random ran=new Random();
		int value= ran.nextInt(100);
		return value;
	}

}
