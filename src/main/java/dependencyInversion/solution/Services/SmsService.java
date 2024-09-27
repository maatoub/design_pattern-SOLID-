package dependencyInversion.solution.Services;

public class SmsService implements IMessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message Sms: " + message);
    }

}
