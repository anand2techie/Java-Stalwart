package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Exceptions.AccountIdNotFoundException;

public class JDBCTest {
	
	private Connection connection=DBConnectionHelper.getConnection();

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int accountId=78;
		double amountToBeDeposited=40000l;
		JDBCTest jdbcTest=new JDBCTest();
		jdbcTest.depositAmountToAnAccount(accountId, amountToBeDeposited);
	}
	
	void depositAmountToAnAccount(int accountId,double amountToBeDeposited) throws ClassNotFoundException
	{
		//write the query as a Statement: update tableName set columnName=<x> where accountNo=<x>;
		String query="update account set amount=? where account_id=?;";
		try {
			//executeQuery --> select /executeUpdate --> insert,update
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			//store newAmount
			double newAmount=getCurrentAmount(accountId)+amountToBeDeposited;
			
			//setting runtime inputs to the query
			preparedStatement.setDouble(1, newAmount);
			preparedStatement.setDouble(2, accountId);
			
			//will execute the query in the DB which we're connecting to.
			preparedStatement.executeUpdate();
			
			//needed, only if autoCommit is set to false
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private  double getCurrentAmount(int accountId) {
		//write the query as a Statement: update tableName set columnName=<x> where accountNo=<x>;
		String query="select * from account where account_id=?;";
		double amount=0;
		int count=0;
		try {
			//executeQuery --> select /executeUpdate --> insert,update
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, accountId);
			
			//will execute the query in the DB which we're connecting to.
			ResultSet resultSet=preparedStatement.executeQuery();
			//iterating the records fetched from the backend
			while(resultSet.next())
			{
				amount=resultSet.getInt("amount");
				count++;
			}
			
			//explicitly throwing an user-defined exception
			if(count==0)
			{
				throw new AccountIdNotFoundException();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amount;
	}

}
