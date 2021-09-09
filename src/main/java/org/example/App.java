package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "How many people?");
        Scanner input = new Scanner(System.in);
        int people, pizzas, slices;
        people = input.nextInt();
        System.out.println("How many pizzas do you have?");
        pizzas = input.nextInt();
        System.out.println("How many slices per pizza?");
        slices = input.nextInt();
        System.out.println(people + " people with " + pizzas + " pizzas (" + (slices*pizzas) + " slices)");
        System.out.println("Each person gets " + (slices*pizzas/people) + " pieces of pizza.");
        System.out.println("There are " + (slices*pizzas) % slices + " leftover pieces.");
    }
}
