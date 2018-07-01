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

public class deritFTLabExer111 {
    public static void main(String[] args) throws IOException {
        final double g = 32.174;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of seconds");
        double t = Double.parseDouble(input.readLine()), d = 0.5 * g * t * t;
        System.out.println("Distance: " + d + " feet");
        
    }
}
