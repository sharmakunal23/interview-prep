
## Factory Design Pattern

> The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

It’s particularly useful in situations where:

- The exact type of object to be created isn't known until runtime.
- Object creation logic is complex, repetitive, or needs encapsulation.
- You want to follow the Open/Closed Principle, open for extension, closed for modification.

Example:

```java
public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationCreator creator;

        // Send Email
        creator = new EmailNotificationCreator();
        creator.send("Welcome to our platform!");

        // Send SMS
        creator = new SMSNotificationCreator();
        creator.send("Your OTP is 123456");

        // Send Push Notification
        creator = new PushNotificationCreator();
        creator.send("You have a new follower!");
    }
}
```