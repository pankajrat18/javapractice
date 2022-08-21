package Constuctor;

import java.util.ArrayList;

public class TestMainMethod {

	public static void main(String[] args) {
		Flipkart f1 = new Flipkart(77777);
		System.out.println(f1.msisdn);

		ArrayList<String> orderpurchase = new ArrayList<String>();

		orderpurchase.add("One Plus");
		orderpurchase.add("Lenove laptop");
		orderpurchase.add("LCD");

		Flipkart f2 = new Flipkart("Amma", "Baba", orderpurchase);
		System.out.println(f2.username + " " + f2.pswd + " " + f2.orderhisotry);

		ArrayList<String> orderdetails = new ArrayList<String>();
		Flipkart f3 = new Flipkart("Uma", "khali", orderdetails);

		System.out.println(f3.username + " " + f3.pswd + " " + f3.orderhisotry);

		Flipkart f4 = new Flipkart("uuu", "iii");

		System.out.println(f4.username + " " + f4.pswd + " " + f4.orderhisotry);

	}

}
