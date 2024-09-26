import java.io.*;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

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

//        *ENCAPSULATION - attributes of a class will be hidden or private. Can be access only through methods setter and getters
//            MAke the attributes private if you don't have a reason to make them public/protected
//        Paypal paypal = new Paypal(12345);
//        paypal.setCardNumber(6789);
//        System.out.println(paypal.getCardNumber());

//        *INTERFACE a template that can be applied a class. similar to inheritance but specifies what a class has/must do.
//            classes can apply more than one interface.
//            Fish fish = new Fish();
//            Hawk hawk = new Hawk();
//            hawk.hunt();
//            fish.flee();
//            fish.hunt();

//        *POLYMORPHISM greek word "poly" - many, "morph"- form. The ability of an object to identify as more than one type.
//        Payment paypal = new Paypal(1234); POLYMORPHISM (method overriding) since your are overriding the method content
//        Payment creditCard = new CreditCard();
//        Payment[] cards = {paypal, creditCard};
//        for (Payment c : cards) {
//            c.paymentDetails();
//            c.receipt();
//        }

//        *DYNAMIC POLYMORPHISM
//        Scanner scanner = new Scanner(System.in);
//        Payment payment;
//        int choice = 0;
//        // Keep asking for input until a valid choice is made
//        while (choice != 1 && choice != 2) {
//            System.out.println("Which card do you want to use?");
//            System.out.println("Press '1' for Paypal or '2' for Credit card:");
//            // Check if the input is an integer
//            if (scanner.hasNextInt()) {
//                choice = scanner.nextInt();
//                if (choice == 1) {
//                    payment = new Paypal(1234);
//                    payment.paymentDetails();
//                    payment.receipt();
//                } else if (choice == 2) {
//                    payment = new CreditCard();
//                    payment.paymentDetails();
//                    payment.receipt();
//                } else {
//                    System.out.println("Invalid choice. Please enter '1' for Paypal or '2' for Credit card.");
//                }
//            } else {
//                System.out.println("Invalid input. Please enter a number (1 or 2).");
//                scanner.next(); // Clear the invalid input
//            }
//        }
//        scanner.close();  // Close the scanner after usage


//        *EXCEPTION HANDLING an event that occurs du=ring the execution of a program that disrups the normal flow of instructions.
//        Checked Exceptions (must be handled)
//        IOException: I/O operation failures (e.g., reading/writing files, network communication).
//        SQLException: Database access errors (e.g., connection failure, SQL syntax issues).
//                FileNotFoundException: File not found when trying to read/write.
//                ClassNotFoundException: Class not found when dynamically loading.
//        InterruptedException: Thread interrupted during sleep or wait.
//        MalformedURLException: Invalid URL format.
//                Unchecked Exceptions (Runtime Exceptions)
//        NullPointerException: Accessing a method or field on a null object.
//                ArrayIndexOutOfBoundsException: Accessing array indices beyond the bounds.
//        ArithmeticException: Invalid arithmetic operations (e.g., division by zero).
//                IllegalArgumentException: Invalid argument passed to a method.
//        NumberFormatException: Conversion failure from string to number.
//        ClassCastException: Incorrect casting of objects.
//        IllegalStateException: Method invoked in an inappropriate object state.
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter a whole number to divide: ");
//            int x = scanner.nextInt();
//
//            System.out.println("Enter a whole number to divided by: ");
//            int y = scanner.nextInt();
//
//            int z = x/y;
//            System.out.println("The result is: " + z);
//            }
//        catch (ArithmeticException e) {
//               System.out.println("You can't divided by zero you moron!");
//            }
//        catch (InputMismatchException e) {
//            System.out.println("Please enter a valid number! myg.");
//        }
//        catch (Exception e) { //this will print all the errors like a general exception to catch
//            System.out.println("Something went wrong.");
//        }
//        finally {
//            System.out.println("This will always print .");
//        }
//        *FILE  an abstract representation of file and directory pathnames
//        File file = new File("java_message.txt");
//       if(file.exists()) {
//           System.out.println("The file exist!");
//           System.out.println(file.getPath()); //path name
//           System.out.println(file.getAbsoluteFile()); // full path
//           System.out.println(file.isFile()); // check if the file is file.
//           file.delete();
//       } else {
//           System.out.println("The file doesn't exist!");
//       }

//        *FILEWRITER  way to write text data to files in Java, making it useful for various applications where file output is needed.
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter("personData.text", true));) { //append flag - true means append it instead of overwite the previous data
//            writer.write("Lotsu Soba\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        *BUFFEREDREADER wraps around a Reader (like FileReader) to buffer input. Reads larger chunks of data at once, which improves performance. Provides a readLine() method to read an entire line at once.
//        *FILEREADER class for reading character files. Reads data one character at a time.


//        try(BufferedReader reader = new BufferedReader(new FileReader("personData.text"));) {
//            String line;
//            while((line = reader.readLine()) != null) { // Each time you go through the loop, it reads a new line.
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//                e.printStackTrace();
//        }

//        *INPUTSTREAM use for reading byte strings
//        *OUTPUTSTREAM use for writing a byte strings
//        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:/Users/Mark Piolo Pascual/Downloads/byte_character_content.txt"));
//            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:/Users/Mark Piolo Pascual/Downloads/created_byte_character_content.txt"))) {
//            byte[] buffer = new byte[1024]; //This buffer is typically used for reading or writing data in chunks, which helps improve performance by reducing the number of I/O operations.
//            int byteContent;
//            while((byteContent = inputStream.read(buffer)) != -1 ) { // read(buffer) method returns the number of bytes read, which is useful for processing chunks of data efficiently.
//                for (int i = 0; i < byteContent; i++) {
//                    System.out.print((char) buffer[i]); // Print each byte value in the buffer and the (char) means it prints the actual character representation of the byte values stored in the buffer.
//                }
////                outputStream.write(buffer, 0, byteContent); // 0 writing will begin at the very start of the buffer.
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        // Writing
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("path/to/outputfile"))) {
//            byte[] data = "Hello, Buffered World!".getBytes();
//            bos.write(data); // Write the byte array to the output stream
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        *JAVA COLLECTION FRAMEWORKS
//        *LINKEDLIST  A doubly linked list, faster for inserting/removing in the middle, slower for random access.
//        List<String> linkLists = new LinkedList<String>();
//        linkLists.add("A");
//        linkLists.add("B");
//        linkLists.add("C");
//        linkLists.remove(2);
//        linkLists.add(1, "D");
//        System.out.print(linkLists);

//        ARRAYLIST  A resizable array, great for random access. Slower for adding/removing elements in the middle.
//        List<String> arrayList = new ArrayList<String>();
//        arrayList.add("Y");
//        arrayList.add("S");
//        arrayList.add("M");
//        arrayList.remove(2);
//        arrayList.add(1, "M");
//        arrayList.indexOf("Y");
//        System.out.print(arrayList);

//        *HASMAP is similar with ArrayList, but with key-value pairs stores objects, need to use wrapper-class ex.(name, address), (username, userID).
//        Map<Integer, String> userMap = new HashMap<Integer, String>(); //Does not maintain any order and may appear to reorder keys based on internal hashing..
//        userMap.put(1, "Yasmin");
//        userMap.put(3, "Mark");
//        userMap.put(2, "Dos");
//        userMap.put(4, "Lotso");
//        System.out.println(userMap);
//        System.out.println(userMap.containsValue(2002)); //chech if the userMap  contains the value(2002) returns true if it's true.
//        userMap.replace("Yasmin",29); // (key, and the newValue);

//        for(Map.Entry<String, Integer> user : userMap.entrySet()) { // this is how you iterate the items in map(old iterate).
//            String name = user.getKey();
//            Integer id = user.getValue();
//            System.out.println("Username: "+name+"\nId: "+id+"\n");
//        }
//        userMap.forEach((name, id) -> System.out.println("Username: "+name+"\nId: "+id+"\n"));


//        *TREEMAP similar to HashMap but follow the orders. Elements(key-value pairs) are sorted. TreeMap refers to the sorted order of the keys.
//        Map<Integer, String> userTreemap = new TreeMap<Integer, String>();
//        userTreemap.put(4, "Yasmin");
//        userTreemap.put(3, "Mark");
//        userTreemap.put(1, "Dos");
//        userTreemap.put(3, "Lotso");
//        System.out.println(userTreemap);
//        Output: {1=Dos, 2=Mark, 3=Lotso, 4=Yasmin} //  Always reorders the keys in sorted order (ascending by default)

//        *HASHSET Sets store individual elements (no key-value pairs), and all elements must be unique.
//        Set<String> hashSets = new HashSet<String>();
////            hashSets.add("Apple");
////        hashSets.add("Orange");
////        hashSets.add("Apple");
////        System.out.println(hashSets);
//        [Apple, Orange] // Output


//        *MULTITHREADING By using multithreading, we can have multiple tasks run concurrently(at the same time). This way, while one task is waiting (like for a file to be read), another task can start executing without waiting for the first to finish.  By default, Java programs are single-threaded, meaning that the code executes line-by-line, from top to bottom,
//        MultiThreading mything = new MultiThreading();
//        Thread myThread = new Thread(mything);
//        Thread myThread2 = new Thread(mything);
//        Thread myThread3 = new Thread(mything);
//        myThread.start();
//        myThread2.start();
//        myThread3.start();

//        int coresCount = Runtime.getRuntime().availableProcessors();
//        ExecutorService executorService = Executors.newFixedThreadPool(coresCount);
//        for (int i = 0; i <= 10; i++) {
//            executorService.submit(new MultiThreading(i));
////            myThread.join(5000); // let the thread finish first before executing the next thread
////            myThread.interrupt(); //Interrupt the thread after base on the sleep time in join(). Signals to the thread that it should stop
//        }
//        executorService.shutdown();
//        try {
//            // Wait for tasks to complete, with a timeout
//            if (!executorService.awaitTermination(2, java.util.concurrent.TimeUnit.SECONDS)) {
//                // If tasks are still running after the timeout finished, it force shutdown.
//                executorService.shutdownNow();
//            }
//        } catch (InterruptedException e) {
//            executorService.shutdownNow(); // Force shutdown on interruption
//        }
//
//        System.out.println("Executor service shut down");


//        *REENTRANTLOCK is synchronization mechanism in Java that allows threads to safely access shared resources by providing exclusive access to a block of code.
//            Example in ecommerce; If multiple threads (representing different customer orders) try to access and modify the inventory at the same time, it could lead to problems, such as overselling a product.
//        When one customer tries to buy a product, the system needs to check if the product is in stock and then decrease the inventory count. If another customer places an order at the same time, both orders might see that there is still inventory available, leading to overselling.

//        Wait for the current thread to finish the critical section and after the thread is finish it will unlock so the next thread can access it.

//        Example of this block of code
//        public class Inventory {
//            private int stock = 10; // Example inventory count
//            private final ReentrantLock lock = new ReentrantLock();
//
//            public void processOrder(int orderId) { // Once the order is processed (or if stock is insufficient), it releases the lock. This allows other threads to acquire the lock and process their orders.
//                lock.lock(); // Acquire the lock
//                try {
//                    if (stock > 0) {
//                        System.out.println("Processing order ID: " + orderId);
//                        stock--; // Decrease inventory
//                        System.out.println("Order ID " + orderId + " processed successfully. Remaining stock: " + stock);
//                    } else {
//                        System.out.println("Order ID " + orderId + " cannot be processed. Out of stock!");
//                    }
//                } finally {
//                    lock.unlock(); // Release the lock
//                }
//            }
//        }


    }


//    EXAMPLE OF OVERLOAD METHODS
//    *POLYMORPHISM (method overloading) same methods but different parameters.
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