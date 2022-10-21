package goodcode;

import badcode.MyBadCode;
import goodcode.animal.*;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyGoodCode {

    private static final Logger logger = Logger.getLogger(MyGoodCode.class.getName());

    private static final Map<String, Animal> animalStrategy = Map.of(
            "bird", new Bird(),
            "cat", new Cat(),
            "dog", new Dog(),
            "monkey", new Monkey()
    );

    public static void main(String[] args) {

        logger.info("Whats the pet name?");

        var petName = getConsoleInput();

        var animal = animalStrategy.get(petName);

        makeSound(animal.sound());
    }

    private static String getConsoleInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void makeSound(String soundCaption) {
        logger.log(Level.INFO, "Making sound: {0}", soundCaption);
    }
}
