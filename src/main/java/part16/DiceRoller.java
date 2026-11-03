package part16;
import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    //creates a int variable
    DiceRoller() {
        random = new Random();
        //creates a new random
        roll();
        //calls the method
    }

    void roll() {
        number = random.nextInt(6) + 1;
        //choses a random number between 1 and 6
        System.out.println(number);
        //prints thd sttement
    }
}
