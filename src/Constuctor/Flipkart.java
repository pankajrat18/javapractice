package Constuctor;

import java.util.ArrayList;

public class Flipkart {

	String username;
	String pswd;
	long msisdn;
	ArrayList<String> orderhisotry;

	public Flipkart(String username, String pswd) {
		this.username = username;
		this.pswd = pswd;

	}

	public Flipkart(long msisdn) {

		this.msisdn = msisdn;
	}

	public Flipkart(String username, String pswd, ArrayList<String> orderhisotry) {

		this.username = username;
		this.pswd = pswd;

		this.orderhisotry = orderhisotry;
	}

}
