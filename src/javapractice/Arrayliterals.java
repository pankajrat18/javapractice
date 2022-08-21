package javapractice;

import java.util.Arrays;

public class Arrayliterals {
	// Approadch-01

	/*
	 * public String[] getDeviceDetails(String empName) {
	 * System.out.println("Welcome to IT Team : " + empName); String devices[] =
	 * null; // List<String> list = null;
	 * 
	 * empName = empName.toLowerCase(); if (empName.trim().equals("uma")) { devices
	 * = new String[] { "macbook", "iphone" };
	 * 
	 * } else if (empName.trim().equals("kurma")) { devices = new String[] { "Nokia"
	 * };
	 * 
	 * } else if (empName.trim().equals("yoyo")) { devices = new String[] {
	 * "Samsung", "Oneplus", "Smartwatch" };
	 * 
	 * } else { System.out.println("Enter the correct emp Name details " + empName);
	 * } return devices; }
	 */

	// Approach-02

	public String[] getDeviceDetails(String empName) {
		System.out.println("Welcome to IT Team : " + empName);
		String devices[] = null;
		// List<String> list = null;

		empName = empName.toLowerCase();
		if (empName.trim().equals("uma")) {
			devices = "macbook, iphone".split(",");

		} else if (empName.trim().equals("kurma")) {
			devices = "Nokia".split(",");

		} else if (empName.trim().equals("yoyo")) {
			devices = new String[] { "Samsung", "Oneplus", "Smartwatch" };

		} else {
			System.out.println("Enter the correct emp Name details " + empName);
		}
		return devices;
	}

	public static void main(String[] args) {

		Arrayliterals obj = new Arrayliterals();
		String a[] = obj.getDeviceDetails("Kurma");
		System.out.println(Arrays.toString(a));

	}

}
