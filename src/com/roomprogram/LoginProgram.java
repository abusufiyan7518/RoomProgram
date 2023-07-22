package com.roomprogram;

import java.util.Scanner;

class Login {
	private String password;
	private String username;

	void login() {

		String username = "Sufiyan";
		String password = "Tech@";
		this.username = username;
		this.password = password;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Username");
		String inputUserName = scanner.nextLine();

		System.out.println("Enter your Password");
		String inputPassword = scanner.next();
		if (username.equalsIgnoreCase(inputUserName) && password.equalsIgnoreCase(inputPassword)) {
			System.out.println("Log into existing account Successful!...");
		} else {
			System.out.println("Oops...Login Failed...\n" + "Create new account:...\n" + "UserName:"
					+ inputUserName.toUpperCase() + " Pass:" + inputPassword);
		}
		scanner.close();
	}
}

public class LoginProgram {
	public static void main(String[] args) {
		Login log = new Login();
		log.login();
	}
}
