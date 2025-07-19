package adapter.payment.legacygateway;

public class LegacyPaymentGateway {
    private long transactionId;
    private boolean isTransactionSuccessful;

    public void executeTransaction(double amount, String currency) {
        System.out.println("LegacyPaymentGateway: Processing payment...");
        isTransactionSuccessful = true;
        transactionId = System.nanoTime();
        System.out.println("LegacyPaymentGateway: Payment Processed Successfully!");
    }

    public boolean checkStatus() {
        return isTransactionSuccessful;
    }

    public long getTransactionId() {
        return transactionId;
    }
}
