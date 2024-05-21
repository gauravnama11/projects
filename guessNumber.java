package Number;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {
        Random randomNum = new Random();
        //Use to get user input,
        Scanner scanner = new Scanner(System.in);

       //Generate a Random number in integer
        int random = randomNum.nextInt(100);

        System.out.println("** Welcome to  game guessing Random Number ** ");
        System.out.println("Enter a random  number(1<=number=>100) for playing this game : ");
        int b = scanner.nextInt();


            while   (true) {

               if(b>100){
                   System.out.println("Invalid Number!!");
                   break;

               }
                if (random > b) {
                    System.out.println("please enter a larger number than the one you entered : ");
                    b = scanner.nextInt();
                }
                if (random < b) {
                    System.out.println("please enter a small number than the one you entered : ");
                    b = scanner.nextInt();
                }
                if (random == b) {
                    System.out.println("congratulations you guess a write number and win the game ");
                    System.out.println( " I hope you enjoy !! Play again  ");

                    break;
                }


            }

    }

}
