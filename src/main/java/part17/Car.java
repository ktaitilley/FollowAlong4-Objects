package part17;

public class Car {
    String make = "Ford";
    //creates a string and assigns it ford
    String model = "Mustang";
    //creates a string and assigns it mustang
    String color = "red";
    //creates a string and assigns it red
    int year = 2021;
    //creates a int and assigns it 2021
    public String toString() {
        //method that converts object to readable string
        return make + "\n" + model + "\n" + color + "\n" + year;
        // returns the statement
    }
}
