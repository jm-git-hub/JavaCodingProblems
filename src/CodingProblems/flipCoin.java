package CodingProblems;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class flipCoin {
    public static void main(String[] args) {
        /*
        I want to create a head/tail game (flipping coin) with java codes;
        -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL " So, let user know that the game started.
            - get user's guess as HEAD/TAIL
            - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
                - if guess is correct, print       ---> "You are lucky, it is your day today."
                - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
            - at the end, ask user "Do you want to play again? Y/N "
                - if the answer is Y --> keep playing (this is your while condition!!!)
                - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"
        */


        String play="Y";
        do {
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL ");
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            String user = scan.nextLine();
            user = user.toUpperCase();

            int chance = rand.nextInt(2);

            if (user.equals("HEAD")) {
                if (chance == 1) {
                    System.out.println("you win");
                }else{
                    System.out.println("Sorry :( Maybe next time");
                }
            } else if (user.equals("TAIL")){
                if (chance == 0) {
                    System.out.println("you win");
                }else{
                    System.out.println("Sorry :( Maybe next time");
                }
            }else{
                System.out.println("You entered an invalid value");
            }

            System.out.println("would you like to continue?Y/N");
            play = scan.nextLine();
            play=play.toUpperCase();

        }while(play.equals("Y"));


    }
}
