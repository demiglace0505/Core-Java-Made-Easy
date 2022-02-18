package privatemethods;

public interface SendNotifications {
	private static void establishConnection() {
		System.out.println("Establishing connection");
	}
	
	static void sendNotification() {
		establishConnection();
		System.out.println("Sending notification");
	}
	
	default void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notifications");
	}
}
