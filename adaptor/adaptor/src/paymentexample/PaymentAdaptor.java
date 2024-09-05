package paymentexample;

public class PaymentAdaptor implements  PaymentGateway{


    private final PayPalPayment payPalPayment;

    public PaymentAdaptor(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }


    @Override
    public void processPayment(String paymentDetails) {
        payPalPayment.makePayment("pay");
    }
}
