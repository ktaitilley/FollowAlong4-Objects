package part17;

public class Pizza {
    String bread;
    //creates a string variable
    String sauce;
    //creates a string variable
    String cheese;
    //creates a string variable
    String topping;
    //creates a string variable

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        //assigns bread to the string variable bread
        this.sauce = sauce;
        //assigns sauce to the string variable sauce
        this.cheese = cheese;
        //assigns chesse to the string variable chesse
        this.topping = topping;
        //assigns toppings to the string variable toppings
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        //assigns bread to the string variable bread
        this.sauce = sauce;
        //assigns sauceto the string variable sauce
        this.cheese = cheese;
        //assigns chesse to the string variable chesse
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        //assigns bread to the string variable bread
        this.sauce = sauce;
        //assigns sauce to the string variable sauce
    }

    Pizza(String bread) {
        this.bread = bread;
        //assigns bread to the string variable bread
    }

    Pizza() {
        // default constructor

    }

    public String toString() {
        return ""+bread + " pizza with "+sauce+", " +cheese +", and "+ topping;
    }
}
