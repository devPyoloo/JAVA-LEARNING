import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        *USER INPUT utilizing 'Scanner'
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name ");
//        String name = scanner.nextLine();
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("What is your favourite food? ");
//        String food = scanner.nextLine();
//        System.out.println("My name is "+ name);
//        System.out.println("I'm "+ age + " years old" );
//        System.out.println("I like "+food);

//        *GUI INTRO using 'JOptionPane'
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null,"Your name "+name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null,"Your height is "+height+ " cm tall");

//        *WHILE LOOP
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while(name.isBlank()) {
//            System.out.println("Enter your name:");
//            name = scanner.nextLine();
//        }
//        System.out.println("Your name is "+name);

//        *FOR LOOP
//        for(int i = 5; i >= 0; i--) {
//            System.out.println(i);
//        }
//            System.out.println("Happy new year!!");
//        String[] cars = {"Nissan", "GTR", "Tesla", "Porshe", "Ferrari"};
//        for(int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//        *2D ARRAYS
//        String[][] cars = {
//                            {"X", "X", "O"},
//                            {"O", "X", "X"},
//                            {"O", "O", "X"}
//                            };
//        for(int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for(int j = 0; j < cars[i].length; j++ ) {
//                System.out.print(cars[i][j]+" ");
//            }
//        }
//        *WRAPPER CLASS is useful in java collections framework like (ArrayList)
//            Boolean a = true; wrapper
//            Integer b = 9; wrapper
//            boolean b = true; raw primitives

//       *ARRAYLIST is resizeable array. Elements can be added and removed after compilation phase store reference data types
//        ArrayList<String> fruitsList = new ArrayList<String>();
//        fruitsList.add("Banana");
//        fruitsList.add("Apple");
//        fruitsList.add("Orange");
//        fruitsList.set(0, "Mango"); replace item in array
//        fruitsList.remove(2); remove item from the array
//                fruitsList.clear(); remove all items
//        for(int i = 0; i < fruitsList.size(); i++) {
//            System.out.println(fruitsList.get(i));
//        }

//        *2D ARRAYS IN ARRAYLIST
//        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
//        ArrayList<String> fruitsList = new ArrayList<String>();
//        fruitsList.add("Banana");
//        fruitsList.add("Apple");
//        ArrayList<String> MeatsList = new ArrayList<String>();
//        MeatsList.add("Pork");
//        MeatsList.add("Beef");
//        ArrayList<String> drinksList = new ArrayList<String>();
//        drinksList.add("Yakult");
//        drinksList.add("Cranberry");
//        groceryList.add(fruitsList);
//        groceryList.add(MeatsList);
//        groceryList.add(drinksList);
//        for(int i = 0; i < groceryList.size(); i++) {
//            System.out.println();
//            for(int j = 0; j < groceryList.get(i).size(); j++) {
//                System.out.print(groceryList.get(i).get(j) + " ");
//            }
//        }

//        *FOREACH ITERATE THROUGH THE ELEMENTS OF ARRAY/COLLECTIONS
//        ArrayList<String> fruitsList = new ArrayList<String>();
//        fruitsList.add("Banana");
//        fruitsList.add("Apple");
//
//        for(String i : fruitsList) {
//            System.out.println(i);
//        }
//        fruitsList.forEach(fruit -> System.out.println(fruit));

//        *OVERLOAD METHODS is methods share the same name but have different parameters method name + parameters = method signature
//        int y = add(1,2,3);
//        double z = add(1.0,2.0,3.2);
//        System.out.println(z);

//        *PRINTF can control how data is displayed using format specifiers.It is similar to println and print but this one can style the format.
//            String name = "Yasmin";
//            int age = 22;
//            boolean mybool = true;
//            double money = 1000;
////            System.out.printf("Name: %s Age: %d\n It is %b", name, age, mybool);
//
////            *[precision]: formatting a decimal
//        System.out.printf("Total money is: %.2f", money);

//        *OOP IS AN INSTANCE CLASS THAT MAY CONTAIN ATTRIBUTES AND METHODS
//        Car mycar = new Car("Porsche","GTR6",2001);
//        String car = mycar.model;
//        System.out.println(mycar);  //toString method returns a string the textually represents of a object
//        Car mycar2 = new Car("Toyota","Skyline Nissan",2005);
//        mycar.seMake("Ferrari");
//        System.out.println(mycar.getMake());
//        System.out.println(mycar.model);
//        System.out.println(mycar.year);
//        mycar.drive();
//        mycar2.drive();
//        mycar2.brake();

//        *VARIABLE SCOPE (LOCAL, GLOBAL)
//        local - declared inside the scope/method and only visible within the scope/method
//        global - declared outside the scope/method and it is visible to all parts of a class
//        EXAMPLE DICE
//        Dice diceRoller = new Dice();

//        *OBJECT PASSING
//        Car mycar = new Car("Porsche","GTR6",2001);
//        Garage garage = new Garage();
//        garage.park(mycar.model);

//        *STATIC modifier. A single copy of a variable/method is created and shared. The class owns the static member;
//        Cart product1 = new Cart("Clothe");
//        Cart product2 = new Cart("Pants");
//        Cart product3 = new Cart("Perfume");
//        Cart product4 = new Cart("Jacket");
//        System.out.println(Cart.cartItems);
//        Cart.displayNoCartItems();

//        *INHERITANCE a process where one class acquires the attributes and methods of another.
//        *METHOD OVERRIDING a method in sub class, which already parent class done so that a child class can give it's own implementation.'
//            Person person = new Person();
//            Yasmin personName = new Yasmin();
//            System.out.println(personName.charateristic);
//            personName.walking();
//        personName.running();

//        *SUPER keyword refers to the superclass (parent) of an object very similar to the this() keyword.
//            Yasmin personName = new Yasmin("Soba",22,"supportive");
//            System.out.println(personName.toString());

//        *ABSTRACT classes cannot be instantiated, but they can have a subclass abstract methods are declared without an implementation.
//        Payment payment = new Paypal(); //use Parent class(parent) as reference when sub-class(Paypal) methods is covered in parent class
////        Payment creditcard = new CreditCard();
//        if(payment instanceof Payment) { // use this condition when you want to access the sub-class method that is only specified in that sub-class(Paypal)
//            Paypal paypal = (Paypal) payment;
//            paypal.validateCard();
//        }
//        payment.paymentDetails();
//        payment.receipt();
////        creditcard.paymentDetails();
////        creditcard.receipt();





//        *ACCESS MODIFIERS (protect, private, public)
        //protected can access the attributes and method when the sub-class extends parent class.
        //public can access everywhere class,package, subclass or world.
        //private can only access within the class itself.
//        Payment paypal = new Paypal();
//        Paypal paypal = new Paypal();
//        System.out.println(paypal.protectedMessage);
//        System.out.println(paypal.);

//        *ENCAPSULATION - attritubes of a class will be hidden or private. Can be access only through methods setter and getters
//            MAke the attributes private if you don't have a reason to make them public/protected
        Paypal paypal = new Paypal(12345);
//        paypal.setCardNumber(6789);
        System.out.println(paypal.getCardNumber());





    }


//    EXAMPLE OF OVERLOAD METHODS
//    static int add(int a, int b) {
//        return a + b;
//    }
//    static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//    static double add(double a, double b) {
//        return a + b;
//    }
//    static double add(double a, double b, double c) {
//        return a + b + c;
//    }

}