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

public class deritFTLabExer122 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of items:");
        int num = Integer.parseInt(input.readLine());
        System.out.println("Heating time:");
        double time = Double.parseDouble(input.readLine());
        switch(num) {
            case 1: break;
            case 2: time *= 1.50; break;
            case 3: time *= 2; break;
            default: time = 0;
        }
        System.out.println((time == 0 ? "Not Recommended!" : "Recommended time: " + time));
    }
    
}
