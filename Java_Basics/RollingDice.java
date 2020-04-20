package Java_Basics;
// Creating a guessing game for a dice
// Importing Random library to generate Random Numbers
import java.util.Random;

// Importing Scanner library to take user input
import java.util.Scanner;

public class RollingDice {

    public static void main(String[] args){

        Random rand = new Random();
        Scanner userinput = new Scanner(System.in);

        int dice = rand.nextInt(6);

        int count = 1;

        while( count <6) {

            int input;

            System.out.print("Guess a number: ");
            input = userinput.nextInt();

            if ( input == dice) {
                System.out.println("You won");
                System.out.println("You won by trying: "+ count + " times");
                break;
            } else if (input > dice) {
                System.out.println("TOO High");
            } else if ( input < dice) {
                System.out.println("Too Low");
            } else {
                System.out.println("Try Again");
            }
            count++;

        }
        if (count > 5) {
            System.out.println("Better Luck Next Time");
        }


    }
}
