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

public class deritFTLabExer116 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int capacity, reading, miles;
        System.out.println("Tank Capacity:");
        capacity = Integer.parseInt(input.readLine());
        System.out.println("Gage reading:");
        reading = Integer.parseInt(input.readLine());
        System.out.println("Miles per gallon:");
        miles = Integer.parseInt(input.readLine());
        reading = 100 / reading;
        int remaining = capacity / reading;
        System.out.println(remaining > 200 ? "Safe to Proceed!" : "Get Gas!");
    }
}
