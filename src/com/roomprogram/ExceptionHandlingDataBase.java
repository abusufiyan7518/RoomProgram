package com.roomprogram;

class DataBaseConnection {
	String connect()  {
		return "Error connecting to database>>>";
	}
}

class MYSqlConnection extends DataBaseConnection {
	String connect()  {
		System.out.println("Connecting to MySql database");
		return super.connect();
	}
}

public class ExceptionHandlingDataBase {
	public static void main(String[] args) {
		DataBaseConnection dbconnection = new MYSqlConnection();
		System.out.println(dbconnection.connect());

	}
}

