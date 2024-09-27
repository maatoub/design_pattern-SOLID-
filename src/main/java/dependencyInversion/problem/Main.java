package dependencyInversion.problem;

import dependencyInversion.problem.services.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification("Test Email ", "email");

        notificationService.sendNotification("Test SMS", "sms");
    }
}
