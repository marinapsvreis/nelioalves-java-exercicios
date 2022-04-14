package model.entities;

import model.exceptions.withdrawException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws withdrawException {
		if (amount > withdrawLimit) {
			throw new withdrawException("Withdraw error: The amount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new withdrawException("Withdraw error: Not enough balance");
		} else {
			balance -= amount;
			System.out.println("New balance: " + String.format("%.2f", balance));
		}

	}

}
