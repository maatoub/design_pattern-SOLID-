package liskovSubstitution.exercice;

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card of " + amount + "$");
    }

}
