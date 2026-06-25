public class main {

    public static void main(String[] args) {

        PaymentProcessor processor =
                new PayPalAdapter(new PayPalGateway());

        processor.processPayment(5000);

    }

}