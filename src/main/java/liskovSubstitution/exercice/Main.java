package liskovSubstitution.exercice;

public class Main {
    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(100);
        System.out.println("----------------------------");
        Payment payment2 = new PayPalPayment();
        payment2.processPayment(50);

    }
}
