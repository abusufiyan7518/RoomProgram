package com.roomprogram;

abstract class MessagingApp {
	public abstract String sendMessage(String message);
}
class WhatsApp extends MessagingApp {
	private String phoneNumber;

	public WhatsApp(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String sendMessage(String message) {
		return "Sending message via WhatsApp:" + message;
	}

	public String makeCall() {
		return "Making Call via WhatsApp...";
	}

	public String displayPhoneNumber() {
		return "Phone Number:" + phoneNumber;
	}
}
public class MainMessaging {

	public static void main(String[] args) {
		WhatsApp app = new WhatsApp("7518262178");
		System.out.println(app.sendMessage("Hello Guy's\n")+app.makeCall()+"\n"+app.displayPhoneNumber());
	}
}
