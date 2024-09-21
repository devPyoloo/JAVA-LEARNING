public class Cart {
    String name;
    static int cartItems;

    Cart(String name) {
        this.name = name;
        cartItems++;
    }

     public static void displayNoCartItems() {
        System.out.println("You have "+cartItems+" items in the cart");
    }
}
