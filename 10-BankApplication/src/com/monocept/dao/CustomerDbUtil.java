package com.monocept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.monocept.model.Accounts;
import com.monocept.model.Customer;
import com.monocept.model.CustomerAccount;

public class CustomerDbUtil {
	private DataSource dataSource;

	public CustomerDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public boolean validateCustomer(String emailId, String password) {

		try {
			Connection connection = dataSource.getConnection();
			String selectQuery = "select * from customer where email_id=? and password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, emailId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				if (emailId.equals(resultSet.getString("email_id"))
						&& password.equals(resultSet.getString("password"))) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	public void addNewCustomer(Customer customer) {
		try {
			Connection connection = dataSource.getConnection();
			String insertQuery = "INSERT INTO customer (first_name, last_name, email_id, password) VALUES(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, customer.getFirst_name());
			preparedStatement.setString(2, customer.getLast_name());
			preparedStatement.setString(3, customer.getEmail());
			preparedStatement.setString(4, customer.getPassword());

			int rs = preparedStatement.executeUpdate();

			if (rs == 1) {
				System.out.println("Added");
			} else {
				System.out.println("Not added");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Customer> getCustomer(int customerId) {
		List<Customer> customers = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			String selectQuery = "SELECT * FROM customer WHERE cust_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, customerId);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String emailId = resultSet.getString("email_id");
				String password = resultSet.getString("password");

				Customer customer = new Customer(customerId, firstName, lastName, emailId, password);
				customers.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customers;
	}

	public void createCustomerAccount(int customerId) {
		System.out.println("Inside createCustomerAccount");
		try {
			Connection connection = dataSource.getConnection();
			String insertQuery = "INSERT INTO accounts (cust_id) VALUES (?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, customerId);
			int rs = preparedStatement.executeUpdate();

			if (rs == 1) {
				System.out.println("Added");
			} else {
				System.out.println("Not added");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<CustomerAccount> getCustomerDetails() {
		List<CustomerAccount> customerAccounts = new ArrayList<CustomerAccount>();
		try {
			Connection connection = dataSource.getConnection();
			String selectQuery = "SELECT C.customer_id, C.first_name, C.last_name, A.account_number, A.balance from customer C JOIN accounts A ON C.customer_id=A.customer_id";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery);
			System.out.println("in get customers");

			while (resultSet.next()) {
				int customerId = resultSet.getInt("customer_id");
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				int accountNumber = Integer.parseInt(resultSet.getString("account_number"));
				double balance = Double.parseDouble(resultSet.getString("balance"));

				Customer customer = new Customer(customerId, firstName, lastName, null, null);
				Accounts account = new Accounts(accountNumber, balance);

				CustomerAccount customerAccount = new CustomerAccount(customer, account);

				customerAccounts.add(customerAccount);
				
				System.out.println(customerAccounts);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customerAccounts;
	}


}