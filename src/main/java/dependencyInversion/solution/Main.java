package dependencyInversion.solution;

import dependencyInversion.solution.Services.EmailService;
import dependencyInversion.solution.Services.NotificationService;
import dependencyInversion.solution.Services.SmsService;

public class Main {
    public static void main(String[] args) {
        NotificationService emailnotification = new NotificationService(new EmailService());
        emailnotification.sendNotification("test email");

        NotificationService smsnotification = new NotificationService(new SmsService());
        smsnotification.sendNotification("test sms");
    }
}
