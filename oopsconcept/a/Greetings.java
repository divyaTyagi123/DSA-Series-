package oopsconcept.a;

import static oopsconcept.b.Message.message;
// we need to import because it is in another folder not the same folder

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Hello");
        message();  // without importing correct package this will show an error
        // above function is only imported if it is declared as public
    }
}
