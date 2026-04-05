package Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Setter for changing strategy at run time
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayments(int amount) {
        paymentStrategy.pay(amount);
    }
}