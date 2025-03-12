import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int pointSum = 0;
        int goal = 0;
        boolean win = false;
        String playStart = "";

        do {

            System.out.print("Enter R to roll your dice: ");
            playStart = in.nextLine();
            if(playStart.equalsIgnoreCase("R")) {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int crapsRoll = die1 + die2;
                System.out.println("Dice Rolled.");
                System.out.println("..................");
                System.out.println("..................");
                System.out.println("..................");
                System.out.println("..................");
                System.out.println("..................");
                System.out.println("..................");

                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                    System.out.println("You rolled " + crapsRoll + "!" + " You crapped out! You lost.");
                    System.out.println("Play again? [Y/N]");
                    String playerChoice = in.nextLine();
                    if (playerChoice.equalsIgnoreCase("Y")) {
                        win = false;
                    } else if (playerChoice.equalsIgnoreCase("N")) {
                        win = true;
                    }
                } else if (crapsRoll == 7 || crapsRoll == 11) {

                    if (crapsRoll == 7 && pointSum > 0) {
                        System.out.println("You rolled a 7 while having " + pointSum + " as the point sum! You lose.");
                        System.out.println("Play again? [Y/N]");
                        String playerChoice = in.nextLine();
                        if (playerChoice.equalsIgnoreCase("Y")) {
                            win = false;
                        } else if (playerChoice.equalsIgnoreCase("N")) {
                            win = true;
                        }
                    }

                    else {
                        System.out.println("You rolled " + crapsRoll + "!" + " You got a natural! You win!");
                        System.out.println("Play again? [Y/N]");
                        String playerChoice = in.nextLine();
                        if (playerChoice.equalsIgnoreCase("Y")) {
                            win = false;
                        } else if (playerChoice.equalsIgnoreCase("N")) {
                            win = true;
                        }
                    }
                } else {

                    if (pointSum == 0) {
                        System.out.println("You rolled " + crapsRoll + "!" + " That is the point sum! You keep rolling!");
                        pointSum = crapsRoll;
                        goal = pointSum;
                    }

                    else {


                        if (crapsRoll == goal) {
                            System.out.println("You got the point sum! You win!");
                            System.out.println("Play again? [Y/N]");
                            String playerChoice = in.nextLine();
                            if (playerChoice.equalsIgnoreCase("Y")) {
                                win = false;
                            } else if (playerChoice.equalsIgnoreCase("N")) {
                                win = true;
                            }

                        }
                        else {
                            System.out.println("You rolled " + crapsRoll + ". The point to get is " + goal + ".");
                        }
                    }
                }
            }

            else {
                System.out.println("Please press R to roll your dice.");
            }

        }while(!win);

        System.out.println("Game ended.");
        System.exit(0);

    }
}