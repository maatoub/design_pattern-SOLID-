package dependencyInversion.problem.services;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Message email : " + message);
    }
}
