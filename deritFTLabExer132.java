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

public class deritFTLabExer132 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N;
        double sum = 0;
        System.out.println("Enter N");
        N = Integer.parseInt(input.readLine());
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}
