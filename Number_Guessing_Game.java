/* TASK 1 - 𝗡𝗨𝗠𝗕𝗘𝗥 𝗚𝗔𝗠𝗘

1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won. */

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        int trounds = 3; //Total Rounds
        System.out.println("Guess a Number between 1 to 100.");
        System.out.println("You will have 10 turns to guess the right Number !");
        System.out.println("All The Best :)");
        Scanner sc = new Scanner(System.in);
        int hscore = 0; // Highscore
        for (int round = 1; round <= trounds; round++) { //loop for 3 rounds
            Random random_num = new Random();
            int rguess = random_num.nextInt(100);
            int turns = 0; //number of turns
            int guess; //user input number
            int i = 0;
            Boolean wins = false;
            while (wins == false) {
                guess = sc.nextInt();
                turns++;
                if (guess > 100) {//if number is greater than 100
                    System.out.println("Number is out of range. Please choose a number between 1 to 100 only.");
                }
                if (guess == rguess) {
                    wins = true; //you wins
                } else if (i > 8) { //you lost
                    System.out.println(" ");
                    System.out.println("You LOST!!!!");
                    System.out.println("You have lost all your turns. The Right Answer was: " + rguess);
                    System.out.println("Your Score Is 0 :(");
                } else if (guess < rguess) { //Too LOw
                    i++;
                    System.out.println("Too Low ! Your Guess Number is Lower than the Right Number.");
                    System.out.println("You Have " + (10 - turns) + " Turns Left !");
                } else if (guess > rguess) { //too high
                    i++; 
                    System.out.println("Too High ! Your Guess Number is Higher than the Right Number.");
                    System.out.println("You Have " + (10 - turns) + " Turns Left !");
                }
            }
            if (wins) {
                System.out.println(" ");
                System.out.println("CONGRATULATIONS ^.^ YOU WIN!!!!!!");
                System.out.println("Then Number was :" + rguess);
                System.out.println("You used " + turns + " turns to guess the Right Number.");
                int score = (11 - turns) * 10;
                System.out.println("Your Score is " + score + " out of 100.");
                System.out.println(" ");
                if (score > hscore) {
                    hscore = score;
                }
            }
            if (round < trounds) {
                System.out.println("Do You want to play Next Round ?");
                System.out.println("Press 1 for next round!");
                System.out.println("Press any key to end the Game!");
                String playagain = sc.next();
                if (!playagain.equals("1")) {
                    break;
                }
            }
        }
        System.err.println(" ");
        System.out.println("Thanks For Playing The Number Guessing Game :)");
        System.out.println(" ");
        System.out.println("The Highscore in all 3 Rounds is :" + hscore);
        sc.close();
    }
}



