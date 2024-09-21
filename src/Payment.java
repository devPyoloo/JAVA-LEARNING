public abstract class Payment {
    protected String protectedMessage = "This is protected message.";


    abstract void paymentDetails();

    public void receipt() {
        System.out.println("This is the receipt.");
    }
}
