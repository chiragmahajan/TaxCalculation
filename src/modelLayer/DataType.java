/**
 * Class Name    DataType
 
 * Version Info  JDK 8
 
 * Author Name   Chirag Mahajan
 
 * Creation Date      11/01/2019

* Last Updated Date  12/01/2019

* Last Updated By    Chirag Mahajan

* The DataType class contains private variables
* that stores the information of Item
 */
package modelLayer;

import uiLayer.MyException;

public class DataType {

	private String itemName = "";
	private float price;
	private String itemType = "";
	private int quantity;
	private java.util.Scanner scanner;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType() throws MyException {
		if (itemType.isEmpty() == false) {
			itemType = "";
		} else {
			type();// Calling Function to select type of Item
		}

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* Function to select the type of Item */
	void type() throws MyException {
		System.out.println("Try 1");
		System.out.println("1.Raw\t2.Manufactured\t3.Imported");

		scanner = new java.util.Scanner(System.in);
		int max_tries = 3; // maximum tries
		boolean selected = false;

		while (max_tries-- > 0) {
			int choice = scanner.nextInt(); // for choosing an itemType
			switch (choice) {
			case 1:
				itemType = "raw";
				selected = true;
				break;

			case 2:
				itemType = "manufactured";
				selected = true;
				break;

			case 3:
				itemType = "imported";
				selected = true;
				break;

			default:
				break;
			}
			if (selected == false && max_tries != 0) {
				System.err.println("Wrong Choice");
				System.out.println("Try " + (4 - max_tries));
				System.out.println("1.Raw\t2.Manufactured\t3.Imported");
			} else if (max_tries == 0) {
				throw new MyException("Reached Maximum Tries");
			} else {
				break;
			}
		}

	}
	/* End of Function type */

}/* end of Class */
