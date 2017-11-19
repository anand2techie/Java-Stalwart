package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionHelper {

	public synchronized static Connection getConnection() {
		return getMySQLConnection();
	}

	public synchronized static Connection getMySQLConnection() {
		Connection dbConnection=null;

		try {
			//Step 1: Register the driver
			Class.forName(SysConfigs.db_Driver);
			
			//Step2: create a DB Connection object using DriverManager class
			//jdbc:mysql://localhost:portNumber/dbName
			dbConnection = DriverManager.getConnection(
					SysConfigs.db_url, SysConfigs.db_Username,
					SysConfigs.db_Password);
			
			//If u r not setting it, by default autoCommit is going to be true
			dbConnection.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbConnection;
	}
}
