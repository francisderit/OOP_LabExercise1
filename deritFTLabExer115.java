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

public class deritFTLabExer115 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        System.out.println("Number of bolts:");
        int bolts = Integer.parseInt(input.readLine());
        System.out.println("Number of nuts:");
        int nuts = Integer.parseInt(input.readLine());
        System.out.println("Number of washers:");
        int washers = Integer.parseInt(input.readLine());
        int totalCost = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
        System.out.println("Check the order \n\n" + "Total cost: " + totalCost);
    }
}
