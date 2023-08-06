import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        int trounds = 3;
        System.out.println("Guess a Number between 1 to 100.");
        System.out.println("You will have 10 turns to guess the right Number !");
        System.out.println("All The Best :)");
        Scanner sc = new Scanner(System.in);
        int hscore = 0;
        for (int round = 1; round <= trounds; round++) {
            Random random_num = new Random();
            int rguess = random_num.nextInt(100);
            int turns = 0;
            int guess;
            int i = 0;
            Boolean wins = false;
            while (wins == false) {
                guess = sc.nextInt();
                turns++;
                if (guess > 100) {
                    System.out.println("Number is out of range. Please choose a number between 1 to 100 only.");
                }
                if (guess == rguess) {
                    wins = true;
                } else if (i > 8) {
                    System.out.println(" ");
                    System.out.println("You LOST!!!!");
                    System.out.println("You have lost all your turns. The Right Answer was: " + rguess);
                    System.out.println("Your Score Is 0 :(");
                } else if (guess < rguess) {
                    i++;
                    System.out.println("Too Low ! Your Guess Number is Lower than the Right Number.");
                    System.out.println("You Have " + (10 - turns) + " Turns Left !");
                } else if (guess > rguess) {
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
