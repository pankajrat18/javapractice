package javapractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Page {

	public ArrayList<String> getMenuItems(String pageName) {
		System.out.println("Page name is: " + pageName);

		ArrayList<String> menuitems = new ArrayList<String>();

		if (pageName.trim().equalsIgnoreCase("login page")) {
			menuitems.add("product");
			menuitems.add("Username");
			menuitems.add("Password");

		} else if (pageName.trim().equalsIgnoreCase("Payment page")) {
			menuitems.add("card");
			menuitems.add("cvv");
			menuitems.add("expiry");

		} else if (pageName.trim().equalsIgnoreCase("Logout page")) {
			menuitems.add("session");
			menuitems.add("logout");
			menuitems.add("Agent");

		} else {
			System.out.println("Pass the correct page name");
		}
		return menuitems;

	}

	public String[] getDeviceDetails(String empName) {
		System.out.println("Emp name is: " + empName);
		String devices[] = new String[3];

		empName = empName.toLowerCase();
		if (empName.trim().equals("uma")) {
			devices[0] = "Macbook";
			devices[1] = "Iphone";

		} else if (empName.trim().equals("kurma")) {
			devices[0] = "Macbook12";
			devices[1] = "Iphone12";
			devices[2] = "Jio";

		} else if (empName.trim().equals("yoyo")) {
			devices[1] = "Nokia";
		} else {
			System.out.println("Enter the correct emp Name details " + empName);
		}
		return devices;
	}

	public static void main(String[] args) {

		Page a = new Page();
		ArrayList<String> totallinks = a.getMenuItems("Logout Page1");
		System.out.println(totallinks);

		String empdevices[] = a.getDeviceDetails("yoyo");
		System.out.println(Arrays.toString(empdevices));

	}

}
