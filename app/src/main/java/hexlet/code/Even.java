package hexlet.code;

import java.util.Scanner;
public class Even {
    static final int minRandom = 0;
    static final int maxRandom = 99;
    static void Go(Scanner sc, String userName){

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int randomNumber = minRandom + (int) (Math.random() * ((maxRandom - minRandom) + 1));
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            System.out.print("Question: " + String.valueOf(randomNumber) + " ");
            String answer = sc.next();

            if ((answer.equalsIgnoreCase("yes") && correctAnswer.equals("yes")) || (answer.equalsIgnoreCase("no") && correctAnswer.equals("no"))) {
                System.out.println("Correct!");

            } else {
                System.out.println( "'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
