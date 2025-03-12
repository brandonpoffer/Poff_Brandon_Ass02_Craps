import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;

        /// if(crapsRoll == 2) {
        ///                 System.out.println("You rolled a 2! You crapped out! You lost. ");
        ///             }
        ///             else if(crapsRoll == 3) {
        ///                 System.out.println("You rolled a 3! You crapped out! You lost. ");
        ///             }
        ///             else if(crapsRoll == 12) {
        ///                 System.out.println("You rolled a 12! You crapped out! You lost. ");
        ///             }


        if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
            System.out.println("You rolled " + crapsRoll + "!" + " You crapped out! You lost.");
        }
        else if(crapsRoll == 7 || crapsRoll == 11) {
            if() {
                System.out.println("You rolled " + crapsRoll + "!" + " You got a natural! You win!");
            }
        }


    }
}