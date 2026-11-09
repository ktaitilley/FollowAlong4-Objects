package part19;

public class Friend {
    String name;
    //creates a string variable
    static int numberOfFriends;
    //creates a static int variable
    Friend(String name) {
        this.name = name;
        //assigns name to name
        numberOfFriends++;
        //adds 1 to the number of friends
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
        //prints the statement
    }
}
