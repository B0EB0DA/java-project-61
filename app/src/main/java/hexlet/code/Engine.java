package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class Engine {
    private static String userName;
    private static Scanner consoleScanner = new Scanner(System.in);
    static void theInterface() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int intAnswer = consoleScanner.nextInt();

        if (intAnswer > 0) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            userName = consoleScanner.next();
            System.out.println("Hello, " + userName + "!");
            switch (intAnswer) {
                case 2:
                    theGame(new Even());
                    break;
                case 3:
                    theGame(new Calc());
                    break;
                case 4:
                    theGame(new GCD());
                    break;
                case 5:
                    theGame(new Progression());
                    break;
                case 6:
                    theGame(new Prime());
                    break;
                default:
                    break;
            }
        }
        consoleScanner.close();
    }

    static void theGame(Game g) {

        System.out.println(g.getHeader());

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + g.nextQuestion());
            System.out.print("Your answer: ");
            String userAnswer = consoleScanner.next();
            String correctAnswer = g.getAnswer();
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.out.println();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.out.println();
    }
}
