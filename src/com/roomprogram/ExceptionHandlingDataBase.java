package com.roomprogram;

import java.sql.SQLException;

class DataBaseConnection {
	String connect() throws SQLException {
		throw new SQLException("Error connecting to database>>>");
	}
}

class MYSqlConnection extends DataBaseConnection {
	String connect() throws SQLException {
		System.out.println("Connecting to MySql database");
		return super.connect();
	}
}

public class ExceptionHandlingDataBase {
	public static void main(String[] args) {
		DataBaseConnection dbconnection = new MYSqlConnection();
		try {
			dbconnection.connect();
		} catch (SQLException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}

	}
}

