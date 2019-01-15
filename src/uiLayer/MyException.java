/**
 * Class Name    MyException
 
 * Version Info  JDK 8
 
 * Author Name   Chirag Mahajan
 
 * Creation Date      12/01/2019

* Last Updated Date  12/01/2019

* Last Updated By    Chirag Mahajan

* The MyException class handles user-
* defined exceptions.
 */
package uiLayer;

@SuppressWarnings("serial")
public class MyException extends Exception {
	String str1;

	public MyException(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("MyException Occurred: " + str1);
	}

}
