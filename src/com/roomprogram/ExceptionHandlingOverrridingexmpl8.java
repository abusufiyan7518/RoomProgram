package com.roomprogram;

class Bank {
	String withraw(int amount) {
		if (amount <= 0) {
			//throw new IllegalArgumentException("Withdrawal amount must be greater than: ₹0 ");
		}
		return "Amount Withdrawn: ₹" + amount;
	}
}
class SavingAcoount extends Bank {
	String withdraw(int amount)  {
		if (amount > 100000) {
		//	throw new IllegalArgumentException("Maximum limit exceeded!");
		}
		return "Saving account withdrawal: ₹" + amount;
	}
}
public class ExceptionHandlingOverrridingexmpl8 {

	public static void main(String[] args) {
		Bank account = new SavingAcoount();
		
			System.out.println(account.withraw(3000));
			System.out.println(account.withraw(110000));
			System.out.println(account.withraw(0));
	
	}
}
