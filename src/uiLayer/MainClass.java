/**
* Class name         Main

* Version Info       JDK 8

* Author name        Chirag Mahajan

* Creation Date      11/01/2019

* Last Updated Date  12/01/2019

* Last Updated By    Chirag Mahajan

* The Main class takes input
* from user about the details of Item

 */
package uiLayer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	private static Scanner scan;

	/* Main Method */
	public static void main(String[] args) throws MyException {

		scan = new Scanner(System.in);
		char enterCondition = 'y'; // For Checking whether to enter new value

		while (enterCondition == 'y' || enterCondition == 'Y') {
			try {
				new Input().taking_input();// function for taking Input

				System.out.println("Want to enter new Item? (y/n)");
				enterCondition = scan.next().charAt(0); // 'y' for new item

			} /* End of try Block */
			catch (MyException message) {
				System.out.println(message);
			} catch (InputMismatchException e) {
				System.out.println("Mismatch of Input");
			}

		}
		/* For Printing Output */
		System.out.println("itemName   PerItemPrice   TaxOnPerItem   TotalFinalPrice");
		for (String list : Input.itemList) {
			System.out.println(list);
		}
	}
	/* End of Main Method */

}/* end of class */
