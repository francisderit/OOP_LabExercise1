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

public class deritFTLabExer110 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter cost per kilowatt-hour in cents");
        double cost, khpy;
        cost = Double.parseDouble(input.readLine());
        System.out.println("Enter kilowatt-hours used per year");
        khpy = Double.parseDouble(input.readLine());
        System.out.println("Annual cost: " + (khpy * cost));
        
    }
}
