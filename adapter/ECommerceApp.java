package adapter;

import adapter.checkout.CheckoutService;
import adapter.payment.InHousePaymentProcessor;
import adapter.payment.LegacyGatewayAdapter;
import adapter.payment.PaymentProcessor;
import adapter.payment.legacygateway.LegacyPaymentGateway;

public class ECommerceApp {
    public static void main(String[] args) {
        // checking out with modern in-house paymentProcessor
        PaymentProcessor paymentProcessor = new InHousePaymentProcessor();
        CheckoutService checkoutService = new CheckoutService(paymentProcessor);
        checkoutService.checkout(100,"Dollars");



        System.out.println("--------------------------------------------");
        // checking out using legacy gateway payment processor
        LegacyPaymentGateway legacyPaymentGateway = new LegacyPaymentGateway();
        paymentProcessor = new LegacyGatewayAdapter(legacyPaymentGateway);
        CheckoutService legacyCheckOut = new CheckoutService(paymentProcessor);
        legacyCheckOut.checkout(1500, "Rupees");
    }
}
