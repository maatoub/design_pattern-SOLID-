package dependencyInversion.problem.services;

public class NotificationService {
    private EmailService emailService;
    private SmsService smsService;

    // NotificationService dépend directement de EmailService et SmsService
    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }

    public void sendNotification(String message, String type) {
        if (type.equals("email")) {
            emailService.sendEmail(message);
        } else if (type.equals("sms")) {
            smsService.sendSms(message);
        }
    }
}
