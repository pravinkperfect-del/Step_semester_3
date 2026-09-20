package main.java.Session1_java_String.class_problems;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissorsGame {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Rock, Paper or Scissors: ");
            String player = sc.next();

            String computer = moves[random.nextInt(3)];

            String result = playRound(player, computer);

            System.out.println("Computer: " + computer);
            System.out.println("Result: " + result);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + winPercentage);

        sc.close();
    }
}
