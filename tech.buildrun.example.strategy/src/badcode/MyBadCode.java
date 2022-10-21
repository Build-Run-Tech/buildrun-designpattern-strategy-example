package badcode;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyBadCode {

    private static final Logger logger = Logger.getLogger(MyBadCode.class.getName());

    public static void main(String[] args) {

        logger.info("Whats the pet name?");

        var petName = getConsoleInput();

        switch (petName) {
            case "dog":
                makeSound("Bark!");
                break;
            case "cat":
                makeSound("Meow!");
                break;
            case "bird":
                makeSound("Sing!");
                break;
            case "monkey":
                makeSound("Uh uh Ah ah!");
                break;
        }

    }

    private static String getConsoleInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void makeSound(String soundCaption) {
        logger.log(Level.INFO, "Making sound: {0}", soundCaption);
    }
}
