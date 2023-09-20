package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
public class Engine {
    private static String userName;
    private static final Scanner consoleScanner = new Scanner(System.in);
    static void theInterface() {

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");
            int intAnswer = consoleScanner.nextInt();

            if (intAnswer == 0) break;

            if (userName == null) {
                System.out.println();
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                userName = consoleScanner.next();
            }
            System.out.println("Hello, " + userName + "!");

            switch (intAnswer) {
                case 2 -> theGame(new Even());
                case 3 -> theGame(new Calc());
                case 4 -> theGame(new GCD());
                case 5 -> theGame(new Progression());
            }
        };
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
                System.out.println( "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.out.println();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.out.println();
    }
}
