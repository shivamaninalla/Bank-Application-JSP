package com.monocept.model;

public class CustomerAccount {
	private Customer customer;
	private Accounts accounts;

	public CustomerAccount(Customer customer, Accounts accounts) {
		this.customer = customer;
		this.accounts = accounts;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Accounts getAccount() {
		return accounts;
	}

	@Override
	public String toString() {
		return "CustomerAccount [customer=" + customer + ", account=" + accounts + "]";
	}

	public void setAccount(Accounts accounts) {
		this.accounts = accounts;
	}

}