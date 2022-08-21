package com.interfaces;

public class hdfcBank extends RBIbody implements UKBank, USBank, IndianBank {

	public void interestmanagement() {
		System.out.println("HDFC-Interest management");
	}

	@Override
	public void moneyManagement() {
		System.out.println("HDFC -moneyManagement");

	}

	@Override
	public void SBI() {
		System.out.println("HDFC -- is greater than SBI");

	}

	@Override
	public void visamanagement() {
		System.out.println("HDFC -visamanagement");
	}

}
