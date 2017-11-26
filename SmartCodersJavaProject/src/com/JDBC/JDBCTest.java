package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Exceptions.AccountIdNotFoundException;

public class JDBCTest {
	
	private Connection connection=DBConnectionHelper.getConnection();

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int accountId=78;
		double amountToBeDeposited=40000l;
		JDBCTest jdbcTest=new JDBCTest();
		jdbcTest.depositAmountToAnAccount(accountId, amountToBeDeposited);
		
		jdbcTest.getTransactionsofAnAccount(78);
	}
	
	void depositAmountToAnAccount(int accountId,double amountToBeDeposited) throws ClassNotFoundException
	{
		//Step 3:write the query as a Statement: update tableName set columnName=<x> where accountNo=<x>;
		String query="update account set amount=? where account_id=?;";
		try {
			//Step 4:executeQuery --> select /executeUpdate --> insert,update
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			//store newAmount
			double newAmount=getCurrentAmount(accountId)+amountToBeDeposited;
			
			//setting runtime inputs to the query
			preparedStatement.setDouble(1, newAmount);
			preparedStatement.setDouble(2, accountId);
			
			//will execute the query in the DB which we're connecting to.
			preparedStatement.executeUpdate();//insert,update,alter
			
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
			ResultSet resultSet=preparedStatement.executeQuery();//select
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
	
	List<AccountTransaction> getTransactionsofAnAccount(int accountId)
	{
		List<AccountTransaction> accountTransactions=new ArrayList<AccountTransaction>();
		//write the query as a Statement: update tableName set columnName=<x> where accountNo=<x>;
		String query="select * from transaction where account_id=?;";
		double amount=0;
		int count=0;
		try {
			//executeQuery --> select /executeUpdate --> insert,update
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, accountId);
			//will execute the query in the DB which we're connecting to.
			ResultSet resultSet=preparedStatement.executeQuery();//select
			//iterating the records fetched from the backend
			while(resultSet.next())
			{
				AccountTransaction accountTransaction=new AccountTransaction();
				accountTransaction.setTransactionId(resultSet.getInt("transaction_id"));
				accountTransaction.setCustomerIdBy(resultSet.getInt("customer_id_by"));
				accountTransaction.setAccountIdTo(resultSet.getInt("account_id_to"));
				accountTransaction.setTransactionType(resultSet.getShort("transaction_type"));
				accountTransaction.setTransactionAmount(resultSet.getDouble("transaction_amount"));
				accountTransaction.setTransactionTime(resultSet.getDate("timestamp"));
				accountTransactions.add(accountTransaction);
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
		return accountTransactions;
	
	}

}
