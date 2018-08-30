package com.jetbrains;

import java.util.Scanner;

public class Multiplication
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        System.out.println(" ");
        System.out.println("How large would you like to see them?");

        int size;
        size = keyboard.nextInt();


        for (int i = 0; i <= size; i++)
        {
            for (int j = 0; j <= size; j++)
            {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }
}