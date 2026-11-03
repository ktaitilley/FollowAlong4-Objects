package part16;

public class Human {
    String name;
    //creates a string variable
    int age;
    //creates a int variable
    double weight;
    // creates a double variable
    Human(String name, int age, double weight) {
        //constructor called human
        this.name = name;
        //assigns name to name
        this.age = age;
        //assigns age to age
        this.weight = weight;
        //assigns weight to weight
    }

    void eat() {
        //method called eat
        System.out.println(this.name + " is eating");
        //prints the statement
    }

    void drink() {
        //method called drink
        System.out.println(this.name + " is drinking *burp*");
        //prints the statement
    }
}
