import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;
        int computerValue = randomGenerator.nextInt(3);
        String computerChoice;

        // the code for your solution goes bellow this comment

        if(computerValue == ROCK){
            computerChoice = "rock";
        } else if(computerValue == PAPER){
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        System.out.println("Please enter rock, paper or scissors ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(playerChoice.equals("rock")){
            playerValue = ROCK;
        }
        else if(playerChoice.equals("paper")) {
            playerValue = PAPER;
        }
        else if(playerChoice.equals("scissors")) {
            playerValue = SCISSORS;
        } else {
            System.out.printf("%s is not a valid choice.%n",playerChoice);
        }

        System.out.printf("Computer chose %s, player chose %s.%n", computerChoice, playerChoice);

        if(playerValue == computerValue){
            System.out.println("It's a draw!");
        } else if((playerValue - 1 == computerValue) || (playerValue == ROCK && computerValue == SCISSORS)){
            System.out.println("Player wins!");
        } else {
            System.out.println("The computer wins");

        }
        scanner.close();
    }
}

