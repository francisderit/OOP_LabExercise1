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

public class deritFTLabExer134 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int upper, sumSq = 0, sumCu = 0, j;
        
        System.out.println("Upper limit:");
        upper = Integer.parseInt(input.readLine());
        for (int i = 1; i <= upper; i++) {
            j = i * i;
            sumSq += j;
            sumCu += j * i;
        }
        System.out.println("The sum of Squares is: " + sumSq);
        System.out.println("The sum of Cubes is: " + sumCu);
    }
}
