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

public class deritFTLabExer114 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter amount of purchases:");
        int purchase = Integer.parseInt(input.readLine());
        System.out.println("Discounted price: " + (purchase > 10 ? ((purchase / 10 ) * 9) : purchase));
    }
}
