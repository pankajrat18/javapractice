package com.interfaces;

public class TestRunner {

	public static void main(String[] args) {

		KotakBank obj = new KotakBank();
		obj.visamanagement();
		obj.cashier();
		obj.moneyManagement(24);

		hdfcBank hd = new hdfcBank();
		hd.interestmanagement();

		// Top Casting

		UKBank t1 = new KotakBank();
		t1.moneyManagement();

		USBank t2 = new hdfcBank();
		t2.visamanagement();

		RBIbody t3 = new KotakBank();
		t3.reverseRepoRate();
	}

}
