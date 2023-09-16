package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int intAnswer = sc.nextInt();

        String userName;

        if (intAnswer > 0) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            userName = sc.next();
            System.out.println("Hello, " + userName + "!");


            if (intAnswer == 2)
                Even.Go(sc, userName);
        }

        sc.close();
    }
}
