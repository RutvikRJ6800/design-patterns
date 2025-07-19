package adapter.payment;

public interface PaymentProcessor {
    void processPayment(double amount, String currency);
    boolean isSuccessful();
    String getReferenceNumber();
}
