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

public class deritFTLabExer140 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double weight = 1, shipping = 0;
        while (true) {
            System.out.println("Weight of Order:");
            weight = Double.parseDouble(input.readLine());
            if (weight == 0)
                break;
            shipping = 0;
            if (weight > 10)
                shipping += 5.5;
            else
                shipping += 3;
            System.out.println("Shipping cost: $" + shipping);
        }
        System.out.println("bye");
    }
}
