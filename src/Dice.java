import java.util.Random;

public class Dice {
    Random dice;
    int number;

    Dice() {
        dice = new Random();
        roll();
    }

    void roll() {
        number = dice.nextInt(6)+1;
        System.out.println(number);
    }
}
