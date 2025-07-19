package adapter.payment;

public class InHousePaymentProcessor implements PaymentProcessor {

    private String referenceNumber;
    private boolean isSuccessful;

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("InHousePaymentProcessor: Processing payment...");
        isSuccessful = true;
        referenceNumber = "REF" + System.currentTimeMillis();
    }

    @Override
    public boolean isSuccessful() {
        return isSuccessful;
    }

    @Override
    public String getReferenceNumber() {
        return referenceNumber;
    }
}
