public class CreditCard extends Payment {

    @Override
    void paymentDetails() {
        System.out.println("You are paying using credit card.");
    }
}
