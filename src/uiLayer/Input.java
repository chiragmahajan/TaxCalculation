package uiLayer;

import java.util.ArrayList;
import java.util.Scanner;

import com.nagarro.service.CalculationTaxApi;

import modelLayer.DataType;

public class Input {

	private static Scanner scan;
	public static ArrayList<String> itemList = new ArrayList<String>();
	static DataType data = new DataType();

	public void taking_input() throws MyException {
		scan = new Scanner(System.in);

		if (data.getItemName().isEmpty()) {
			System.out.println("Item Name = ");
			data.setItemName(scan.next()); // Enter Item Name
		}

		if (data.getPrice() <= 0) {
			System.out.println("Item Price = ");
			data.setPrice(scan.nextFloat()); // Enter Price
			if (data.getPrice() <= 0.0) {
				throw new MyException("Price is negative or zero");
			}
		}

		if (data.getItemType().isEmpty()) {
			System.out.println("Item Type = ");
			data.setItemType(); // Enter Item Type
		}

		if (data.getQuantity() <= 0) {
			System.out.println("Quantity = ");
			data.setQuantity(scan.nextInt()); // Enter Quantity
			if (data.getQuantity() <= 0) {
				throw new MyException("Quantity is negative or Zero");
			}
		}

		float tax = new CalculationTaxApi().calculate(data.getItemType(), data.getPrice());
		itemList.add(data.getItemName() + "\t\t\t" + data.getPrice() + "\t\t" + tax + "\t\t"
				+ ((data.getPrice() + tax) * (data.getQuantity())));

		data.setItemName("");
		data.setPrice(0);
		data.setItemType();
		data.setQuantity(0);

	}

}
