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

public class deritFTLabExer133 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double avg = 0, avgSq = 0, num, N, sd;
        System.out.println("Enter N:");
        N = Double.parseDouble(input.readLine());
        for (int i = 0; i < N; i++) {
            num = Double.parseDouble(input.readLine());
            avg += num;
            avgSq += num * num;
        }
        avg /= N;
        avg *= avg;
        avgSq /= N;
        sd = Math.sqrt(avgSq - avg);
        System.out.println("Standard Deviation is: " + sd);
    }
}
