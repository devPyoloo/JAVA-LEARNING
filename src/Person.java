public class Person {
    boolean hasHair = true;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: "+name+"\n"+"Age: "+age+"\n";
    }

    public void walking() {
        System.out.println("The person is walking");
    }
     public void running() {
        System.out.println("The person is running");
     }

}
