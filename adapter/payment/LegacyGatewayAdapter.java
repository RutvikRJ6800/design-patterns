package adapter.payment;

import adapter.payment.legacygateway.LegacyPaymentGateway;

public class LegacyGatewayAdapter implements PaymentProcessor{
    private final LegacyPaymentGateway legacyPaymentGateway;

    public LegacyGatewayAdapter(LegacyPaymentGateway legacyPaymentGateway) {
        this.legacyPaymentGateway = legacyPaymentGateway;
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Adapter: Translating payment for: " + amount +  ", currency: " + currency);
        legacyPaymentGateway.executeTransaction(amount, currency);
    }

    @Override
    public boolean isSuccessful() {
        return legacyPaymentGateway.checkStatus();
    }

    @Override
    public String getReferenceNumber() {
        return "LEGACY_TXN" + legacyPaymentGateway.getTransactionId();
    }
}
