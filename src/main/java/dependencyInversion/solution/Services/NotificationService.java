package dependencyInversion.solution.Services;

public class NotificationService {
    private IMessageService service;

    public NotificationService(IMessageService service) {
        this.service = service;
    }

    public void sendNotification(String message) {
        service.sendMessage(message);
    }
}
