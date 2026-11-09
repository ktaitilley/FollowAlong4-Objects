package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(Friend.numberOfFriends);
        //prints the statement
        Friend friend1 = new Friend("SpongeBob");
        //creates a new friend
        Friend friend2 = new Friend("Patrick");
        //creates a new friend
        Friend friend3 = new Friend("Squidward");
        //creates a new friend
        Friend.displayFriends();
        //calls the method for friend
        Friend friend4 = new Friend("Sandy");
        //creates a new friend
        Friend.displayFriends();
        // calls the method for friend
        System.out.println(Math.round(3.14));
        //prints the statement
    }

}
