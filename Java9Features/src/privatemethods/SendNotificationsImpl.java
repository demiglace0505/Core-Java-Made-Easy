package privatemethods;

public class SendNotificationsImpl implements SendNotifications {
	public static void main(String[] args) {
		SendNotificationsImpl sn = new SendNotificationsImpl();
		SendNotifications.sendNotification();
		sn.sendNotifications();
	}
}
