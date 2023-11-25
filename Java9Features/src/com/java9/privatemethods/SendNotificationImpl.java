package com.java9.privatemethods;

public class SendNotificationImpl implements SendNotifications {

	public static void main(String[] args) {
		SendNotifications sendNotifications = new SendNotificationImpl();
		SendNotifications.sendNotifications();
		sendNotifications.sendNotification();
	}

}
