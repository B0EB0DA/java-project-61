package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static String userName;
    private static final int GAME_2_EVEN = 2;
    private static final int GAME_3_CALC = 3;
    private static final int GAME_4_GCD = 4;
    private static final int GAME_5_PROGRESSION = 5;
    private static final int GAME_6_PRIME = 6;
    private static Scanner consoleScanner = new Scanner(System.in);
    private static final int GAME_CYCLES = 3;
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
        int intAnswer = consoleScanner.nextInt();

        if (intAnswer > 0) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            userName = consoleScanner.next();
            System.out.println("Hello, " + userName + "!");
            switch (intAnswer) {
                case GAME_2_EVEN:
                    Engine.startGame(new Even().getGameData(GAME_CYCLES), userName, consoleScanner);
                    break;
                case GAME_3_CALC:
                    Engine.startGame(new Calc().getGameData(GAME_CYCLES), userName, consoleScanner);
                    break;
                case GAME_4_GCD:
                    Engine.startGame(new GCD().getGameData(GAME_CYCLES), userName, consoleScanner);
                    break;
                case GAME_5_PROGRESSION:
                    Engine.startGame(new Progression().getGameData(GAME_CYCLES), userName, consoleScanner);
                    break;
                case GAME_6_PRIME:
                    Engine.startGame(new Prime().getGameData(GAME_CYCLES), userName, consoleScanner);
                    break;
                default:
                    break;
            }
        }
        consoleScanner.close();
    }
}
