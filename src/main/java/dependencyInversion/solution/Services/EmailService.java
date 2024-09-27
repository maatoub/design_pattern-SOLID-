package dependencyInversion.solution.Services;

public class EmailService implements IMessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message Email: " + message);
    }

}
