package bank;

import java.util.Scanner;

public class ClientData {

	public String name;
	private int accountNumber;
	private double accountValue;

	public ClientData() {
	}
	
	public ClientData(String name, int accountNumber) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public ClientData(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		addMoney(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void addMoney(double accountValue) {
		this.accountValue += accountValue;
	}

	public void subMoney(double accountValue) {
		this.accountValue -= accountValue + 5;
	}
	
	public double totalValue() {
		return accountValue;
	}

	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", accountValue);
	}

}
