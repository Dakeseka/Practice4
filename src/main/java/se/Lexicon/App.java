package se.Lexicon;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner appleGame = new Scanner(System.in);

        System.out.print("How many apples do you have? ");
        int a = appleGame.nextInt();

        System.out.print("How many will you get from mama? ");
        int b = appleGame.nextInt();

        System.out.print("How many from papa? ");
        int c = appleGame.nextInt();

        System.out.print("And how many will you eat? ");
        int d = appleGame.nextInt();

        int e = a + b + c - d;

        if (e < 0) {
            System.out.println("How did you do that!?");
        }
        if (e > 1) {
            System.out.println("That means you'll have " + e + " apples left!");
        }
            if (e == 1) {
                System.out.println("That means you'll have " + e + " apple left!");
            }

        }

    }
