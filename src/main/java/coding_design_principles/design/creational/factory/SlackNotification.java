package coding_design_principles.design.creational.factory;

public class SlackNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Slack Notification: " + message);
    }
}
