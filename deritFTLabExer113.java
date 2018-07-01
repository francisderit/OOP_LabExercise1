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
import java.io.InputStreamReader;
import java.io.IOException;

public class deritFTLabExer113 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter X:");
        double X = Double.parseDouble(input.readLine());
        System.out.println("Enter Y:");
        double Y = Double.parseDouble(input.readLine());
        System.out.println("Arithmetic mean: " + ((X+Y) / 2));
        System.out.println("Harmonic mean: " + (2 / ((1/X) + (1/Y))));
    }
}
