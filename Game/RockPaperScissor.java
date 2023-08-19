import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Random number generator
        Random rand = new Random();

        int userWins = 0; // number of wins by the user

        int compWins = 0; // number of wins by the computer

        System.out.println("Welcome to a Rock Paper and Scissors game!!");

        // using for loop to make this game go for 5 rounds
        for (int round = 1; round <= 5; round++) {
            String comp;
            String user;

            int randomNumber = rand.nextInt(3) + 1;

            // Assigning numbers generated to options
            if (randomNumber == 1) {
                comp = "rock";
            } else if (randomNumber == 2) {
                comp = "scissors";
            } else {
                comp = "paper";
            }

            System.out.println("\nRound " + round);
            System.out.println("\nComputer has made a choice!!");
            System.out.println("Ready set Go!!\n");

            System.out.println("Your Turn:\n1.rock\n2.paper\n3.scissors: ");
            System.out.print("\nYour choice: ");
            user = sc.next().toLowerCase();

            // Checking who won the round
            if (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
                System.out.println("Wrong input please enter\n1.rock\n2.paper\n3.scissors");
            } else {
                if (comp.equals(user)) {
                    System.out.println("The game was a tie");

                } else if (comp.equals("rock")) {

                    if (user.equals("scissors")) {

                        System.out.println("Computer won this round!!");
                        compWins++;

                    } else if (user.equals("paper")) {

                        System.out.println("User won this round!!");
                        userWins++;

                    }

                } else if (comp.equals("paper")) {

                    if (user.equals("rock")) {

                        System.out.println("Computer won this round!!");
                        compWins++;

                    } else if (user.equals("scissors")) {

                        System.out.println("User won this round");
                        userWins++;

                    }
                } else if (comp.equals("scissors")) {

                    if (user.equals("paper")) {
                        System.out.println("Computer won this round!!");
                        compWins++;

                    } else if (user.equals("rock")) {

                        System.out.println("User won this round");
                        userWins++;
                    }
                }

            }

            System.out.println("\n---------------------------------------------------\n");
        }
        // Final result of the game
        if (compWins == userWins) {
            System.out.printf("The game was a tie with a final score of:\nComputer: %d\nUser: %d", compWins, userWins);

        } else if (compWins > userWins) {

            System.out.printf("Computer won the game with final score of:\nComputer: %d\nUser: %d", compWins, userWins);

        } else {

            System.out.printf("User won the game with final score of:\nComputer: %d\nUser: %d", compWins, userWins);
        }

        sc.close();
    }
}
