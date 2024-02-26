package FactoryMethodPattern.Notifications;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending push notifications to users");
    }
}
