package dependencyInversion.problem.services;

public class SmsService {
    public void sendSms(String message) {
        System.out.println("Message sms: " + message);
    }
}
