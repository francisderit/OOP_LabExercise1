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

public class deritFTLabExer118 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double priceA, priceB, percentA, percentB;
        System.out.println("Price per pound package A:");
        priceA = Double.parseDouble(input.readLine());
        System.out.println("Percent lean package A:");
        percentA = Double.parseDouble(input.readLine());
        System.out.println("Price per pound package B:");
        priceB = Double.parseDouble(input.readLine());
        System.out.println("Percent lean package B:");
        percentB = Double.parseDouble(input.readLine());
        percentA /= 100;
        percentB /= 100;
        double packageA = priceA * (2 - percentA), packageB = priceB * (2 - percentB);
        System.out.println("Package A cost per pound of lean:" + packageA);
        System.out.println("Package B cost per pound of lean:" + packageB);
    }
}
