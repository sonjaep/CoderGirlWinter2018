package com.jetbrains;

import static java.lang.System.out;

import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please hit \"enter\" between entries!");
        out.println(" ");

        out.println("What are three items on your grocery list?");
        String firstitem;
        firstitem = keyboard.nextLine();
        String seconditem;
        seconditem = keyboard.nextLine();
        String thirditem;
        thirditem = keyboard.nextLine();
        out.println(" ");

        out.println("What is the quantity of each item?");
        out.println(firstitem + ":");
        int firstquantity;
        firstquantity = keyboard.nextInt();
        keyboard.skip("\n");
        out.println(seconditem + ":");
        int secondquantity;
        secondquantity = keyboard.nextInt();
        keyboard.skip("\n");
        out.println(thirditem + ":");
        int thirdquantity;
        thirdquantity = keyboard.nextInt();
        keyboard.skip("\n");
        out.println(" ");

        out.println("Now, pricing:");
        out.println("How much does " + firstitem + " cost?");
        float firstprice;
        firstprice = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("How much does " + seconditem + " cost?");
        float secondprice;
        secondprice = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("How much does " + thirditem + " cost?");
        float thirdprice;
        thirdprice = keyboard.nextFloat();
        out.println(" ");

        float bill;
        float first;
        first = (float)firstquantity * firstprice;
        float second;
        second = (float)secondquantity * secondprice;
        float third;
        third = (float)thirdquantity * thirdprice;
        out.println("Calculating your grocery bill...");
        bill = first + second + third;
        out.println("Your groceries will cost you " + bill + " dollars.");
        out.println("Bon appetit!");

    }
}
