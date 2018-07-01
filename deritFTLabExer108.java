/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExercise1;

/**
 *
 * @author Francis Derit
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class deritFTLabExer108 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String buffer = input.readLine();
        
        int cents = Integer.parseInt(buffer);
        int dollar, quarter, dime, nickel;
        dollar = cents / 100;
        cents %= 100;
        quarter = cents / 25;
        cents %= 25;
        dime = cents / 10;
        cents %= 10;
        nickel = cents / 5;
        cents %= 5;
        System.out.println("Your change is: ");
        if (dollar != 0)
            System.out.print(dollar + " dollars, ");
        if (quarter != 0)
            System.out.print(quarter + " quarters, ");
        if (dime != 0)
            System.out.print(dime + " dimes, ");
        if (nickel != 0)
            System.out.print(nickel + " nickels, ");
        if (cents != 0)
            System.out.print(cents + " cents, ");
        
    }
}
