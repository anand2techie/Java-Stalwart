package com.designPatternWithJDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Customer;

public class CustomerCRUDDAO {

	//creating = inserting. Everything is set in the DB side.
	void createCustomer(Customer customer)
	{
		//JDBC API coding..... ---> Here We directly connect with DB and we execute queries
		try {
			//1. Register the driver
			Class.forName("com.mysql.jdbc.driver");
			
			//2. Create a connection with the DB
			String db_url="";
			String db_username="";
			String db_pwd="";
			
			//This is the real connection object which you gonnna use it to perform operations
			Connection connection=DriverManager.getConnection(db_url, db_username, db_pwd);
			
			//3. Construct a query
			String query="insert into customer_details(customer_id,customer_name,customer_contact_no) values(?,?,?);";
			
			//4. Create a PreparedStatement
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setLong(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setLong(3, customer.getCustomerContactNo());
			
			//execute the preparedstatement
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void deleteCustomer()
	{
		
	}
	
	void updateCustomer()
	{
		
	}
}
