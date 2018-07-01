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

public class deritFTLabExer138 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double init, fin, gal, miles;
        System.out.println("Miles Per Gallon Program");
        System.out.println("Initial Miles:");
        init = Double.parseDouble(input.readLine());
        if (init < 0)
            System.out.println("bye");
        else {
            System.out.println("final Miles:");
            fin = Double.parseDouble(input.readLine());
            System.out.println("Gallons");
            gal = Double.parseDouble(input.readLine());
            miles = (fin - init) / gal;
            System.out.println("Miles per Gallon: " + miles);
        }
    }
}
