public class Yasmin extends Person {
    String charateristic;

    public Yasmin(String name, int age, String charateristic) {
    super(name, age); //keyword refers to the superclass (parent) of an object very similar to the this() keyword.
    this.charateristic = charateristic;
    }

    public String toString() {
        return super.toString() +"Characteristic: "+charateristic;
    }

    @Override //To let the programmer know that this is override. It's like a comment.
    public void walking() {
        System.out.println("Yasmin is walking");
    }
}
