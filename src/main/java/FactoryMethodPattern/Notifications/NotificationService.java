package FactoryMethodPattern.Notifications;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = getNotificationFactory("PUSH");
        Notification notification = notificationFactory.createNotification();
        notification.notifyUser();
    }

    public static NotificationFactory getNotificationFactory(String type) {
        return switch (type) {
            case "SMS" -> new SMSNotificationFactory();
            case "PUSH" -> new PushNotificationFactory();
            case "Email" -> new EmailNotificationFactory();
            default -> throw new IllegalArgumentException("Unknown Notification Factory Type");
        };
    }
}
