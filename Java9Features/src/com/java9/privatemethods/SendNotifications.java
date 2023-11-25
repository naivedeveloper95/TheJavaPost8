package com.java9.privatemethods;

public interface SendNotifications {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending Multiple notifications");
	}

	default void sendNotification() {
		establishConnection();
		System.out.println("Sending notifications");
	}

	private static void establishConnection() {
		System.out.println("Establishing a connection");
	}
}
