package Creational.FactoryMethodPattern.Notifications;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending email notification to the user");
    }
}
