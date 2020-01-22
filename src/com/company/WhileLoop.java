package com.company;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int secretNumber = 123;

        System.out.println("I am thinking of a number between 1 and 500");
        System.out.println("Enter the number: ");
        guess = scan.nextInt();

        while (guess != secretNumber) {
            if (guess < 1 && guess > 500) {
                System.out.println("Number must be between 1 and 500");
            } else if (guess == 5) {
                System.out.println("Sorry, you entered the trap number");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Number is higher");
                System.out.println("Enter new guess: ");
                guess = scan.nextInt();
            } else if (guess > secretNumber) {
                System.out.println("Number is lower");
                System.out.println("Enter new guess: ");
                guess = scan.nextInt();
            }
        }
        System.out.println("Congrats! You guessed the right number");
    }
}
