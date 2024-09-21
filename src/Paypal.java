public class Paypal extends Payment {
    private int cardNumber;

    public Paypal(int cardNumber){
        this.setCardNumber(cardNumber);
    }

    @Override
    public void paymentDetails() {
        System.out.println("You are paying Paypal method");
    }

    public void validateCard() {
        System.out.println("Validation Paypal...");
    }

    //getters - Encapsulation
    public int getCardNumber() {
        return cardNumber;
    }

    //setters
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
