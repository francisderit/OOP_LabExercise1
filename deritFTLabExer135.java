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

public class deritFTLabExer135 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double X, N, ans = 1;
        System.out.println("Enter X");
        X = Double.parseDouble(input.readLine());
        System.out.println("Enter N");
        N = Double.parseDouble(input.readLine());
        if (N > 0) {
            for (int i = 0; i < N; i++)
                ans *= X;
            System.out.println();
            System.out.println(X + " raised to the power of " + N + " is: " + ans);
        }
        else
            System.out.println("N must be a positive integer");
    }
}
