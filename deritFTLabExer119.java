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

public class deritFTLabExer119 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Year of Birth:");
        int y = Integer.parseInt(input.readLine());
        System.out.println("Current year:");
        int current = Integer.parseInt(input.readLine());
        if (current < y)
            current += 100;
        
        System.out.println("Your age: " + (current - y));
    }
}
