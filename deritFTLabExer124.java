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

public class deritFTLabExer124 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int check, save;
        double charge;
        System.out.println("Checking Balance:");
        check = Integer.parseInt(input.readLine());
        System.out.println("Saving Balance:");
        save = Integer.parseInt(input.readLine());
        if (check > 1000 || save > 1500)
            charge = 0;
        else
            charge = 0.15;
        System.out.println("Charge: " + charge);
    }
}
