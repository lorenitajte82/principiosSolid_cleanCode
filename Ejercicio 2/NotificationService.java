public class NotificationService {
    public void sendEmail(String to, String subject, String body) {
        if (to == null || to.isEmpty()) {
            System.out.println("Invalid email address");
            return;
        }
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

    public void sendSms(String phone, String message) {
        if (phone == null || phone.isEmpty()) {
            System.out.println("Invalid phone number");
            return;
        }
        System.out.println("Sending SMS to: " + phone);
        System.out.println("Message: " + message);
    }

    public void sendPush(String deviceToken, String message) {
        if (deviceToken == null || deviceToken.isEmpty()) {
            System.out.println("Invalid device token");
            return;
        }
        System.out.println("Sending Push Notification to: " + deviceToken);
        System.out.println("Message: " + message);
    }
}