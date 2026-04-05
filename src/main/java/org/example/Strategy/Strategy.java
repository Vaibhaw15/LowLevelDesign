package Strategy;

//Stratgy design pattern is a family of algorithms, encapsulate each one , and make them interchangeble at run time 

//Strategy -> Interface(Common Behaviour)
//Concrete Strategy -> Different Behaviour
//Context -> Uses Strategy



public class Strategy {

    public static void main(String[] args) {
         PaymentContext context = new PaymentContext();

         //use credit card

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        context.setPaymentStrategy(creditCardPayment);
        context.makePayments(100);


        //use UPi

        UpiPayment upiPayment = new UpiPayment();
        context.setPaymentStrategy(upiPayment);
        context.makePayments(100);


    }
}