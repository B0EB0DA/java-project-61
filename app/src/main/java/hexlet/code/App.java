package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    private static final int GAME_1_GREET = 1;
    private static final int GAME_2_EVEN = 2;
    private static final int GAME_3_CALC = 3;
    private static final int GAME_4_GCD = 4;
    private static final int GAME_5_PROGRESSION = 5;
    private static final int GAME_6_PRIME = 6;
    private static Scanner consoleScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = consoleScanner.nextInt();

        switch (gameNumber) {
            case GAME_1_GREET:
                Cli.greeting(consoleScanner);
                break;
            case GAME_2_EVEN:
                Even.startGame(consoleScanner);
                break;
            case GAME_3_CALC:
                Calc.startGame(consoleScanner);
                break;
            case GAME_4_GCD:
                GCD.startGame(consoleScanner);
                break;
            case GAME_5_PROGRESSION:
                Progression.startGame(consoleScanner);
                break;
            case GAME_6_PRIME:
                Prime.startGame(consoleScanner);
                break;
            default:
                break;
        }
        consoleScanner.close();
    }
}
