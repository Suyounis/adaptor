import adapter.LegacyPrinter;
import adapter.Printer;
import adapter.PrinterAdapter;
import paymentexample.PayPalPayment;
import paymentexample.PaymentAdaptor;
import paymentexample.PaymentGateway;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printer = new PrinterAdapter(legacyPrinter);


        printer.print("adaptor simple example");

        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentGateway paymentGateway = new PaymentAdaptor(payPalPayment);

        paymentGateway.processPayment("this is the payment adaptor");



}
}