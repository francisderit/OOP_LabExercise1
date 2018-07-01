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

public class deritFTLabExer121 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double tAir, tSteam, efficiency;
        System.out.println("Air temperature:");
        tAir = Double.parseDouble(input.readLine());
        System.out.println("Steam temperature:");
        tSteam = Double.parseDouble(input.readLine());
        efficiency = tSteam <  373 ? 0 : 1 - (tAir / tSteam);
        System.out.println("The efficiency is: " + efficiency);
    }
}
