public class Car {
    private String make;
    public String model;
    public int year;

    //constructor - special method that is called when an object is instantiated(created).
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //toString method
    public String toString() {
        return make+"\n"+model+"\n"+year;
    }

    public String getMake() {
        return this.make;
    }

    public String park(String car){
        return "Your "+car+" is park in garage";

    }

//    public void seMake(String make) {
//        this.make = make;
//    }

//    public void drive() {
//        System.out.println("You are driving a "+make+" model "+model+" "+year);
//    }
//    public void brake() {
//        System.out.println("You hit on the "+model+" brake");
//    }
}
