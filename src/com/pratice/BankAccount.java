package com.pratice;

public class BankAccount implements java.io.Serializable {
	static double minbalance = 5000;
	private int accNo;
	private String accHName;
	private String Address;
	private transient String UserName;
	private transient String Password;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = this.balance + balance;
	}
	public void setUpdateBalance(double amount) {
		this.balance= amount;
	}

	@Override
	public String toString() {
		return "BankAccount [\naccNo=" + accNo + ", \naccHName=" + accHName + ", \nAddress=" + Address + ", \nUserName="
				+ UserName + ", \nPassword=" + Password + ", \nbalance=" + balance + ",\nminBalance=" + minbalance
				+ "]";
	}

}
