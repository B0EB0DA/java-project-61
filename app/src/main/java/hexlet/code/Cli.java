package hexlet.code;

import java.util.Scanner;
public class Cli {
    static void greeting(Scanner consoleScanner) {
        System.out.print("May I have your name? ");
        String answer = consoleScanner.next();
        System.out.println("Hello, " + answer + "!");
    }
}
