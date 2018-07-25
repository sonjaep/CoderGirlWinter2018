package com.jetbrains;

import static java.lang.System.out;
import java.util.Scanner;

public class TastySammiches
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalVeggies = 50;
        int goalBurgers = 250;
        int goalSubs = 180;
        int goalSoups = 70;

        out.println("Let's check sales!");
        out.println("You're goal is 50. How many veggie sandwiches did you sell today?");
        int veggies;
        veggies = keyboard.nextInt();
        keyboard.skip("\n");

        if (veggies >= goalVeggies){
            out.println("You achieved your goal!");
        } else {
            out.println("Unfortunately, you sold less than your goal.");
        }

        out.println(" ");
        out.println("You're goal is 250. How many burgers did you sell today?");
        int burgers;
        burgers = keyboard.nextInt();
        keyboard.skip("\n");

        if (burgers >= goalBurgers){
            out.println("You sold enough burgers!");
        } else {
            out.println("Unfortunately, you did not sell enough burgers.");
        }

        out.println(" ");
        out.println("You're goal is 180. How many subs did you sell today?");
        int subs;
        subs = keyboard.nextInt();
        keyboard.skip("\n");

        if (subs >= goalSubs){
            out.println("Success! You made your goal!");
        } else {
            out.println("You did not make your goal.");
        }

        out.println(" ");
        out.println("You're goal is 70. How many soups did you sell today?");
        int soups;
        soups = keyboard.nextInt();
        keyboard.skip("\n");

        if (soups >= goalSoups){
            out.println("Great, you sold enough soup!");
        } else {
            out.println("You did not reach your goal. \"No soup for you!\"");
        }

        out.println(" ");
        if (veggies >= goalVeggies && burgers >= goalBurgers && subs >= goalSubs && soups >= goalSoups){
            out.println("Wow, you achieved all of your sales goals! Good for you!");
        }
    }
}
