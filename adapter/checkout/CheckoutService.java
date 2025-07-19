package adapter.checkout;

import adapter.payment.PaymentProcessor;

public class CheckoutService {
    PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount, String currency) {
        System.out.println("CheckoutService: attempting to checkout | amount:" + amount +", currency:" + currency);
        paymentProcessor.processPayment(amount, currency);

        if(paymentProcessor.isSuccessful()) {
            System.out.println("CheckoutService: Order successful! Reference Number:" + paymentProcessor.getReferenceNumber());
        }
        else {
            System.out.println("CheckoutService: Order failed. Payment was not successful");
        }
    }
}
