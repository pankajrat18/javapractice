package com.interfaces;

public class KotakBank extends RBIbody implements UKBank, USBank, IndianBank {

	public void cashier() {
		System.out.println("KotakBank -Cash management");
	}

	@Override
	public void moneyManagement() {
		System.out.println("Kotak-moneyManagement");

	}

	public void moneyManagement(int money) {
		System.out.println("Kotak-moneyManagement");
	}

	@Override
	public void SBI() {
		System.out.println("Kotak-SBI");

	}

	@Override
	public void visamanagement() {
		System.out.println("Kotak-visamanagement");

	}

}
