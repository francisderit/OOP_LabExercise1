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

public class deritFTLabExer131 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int times, num, sum = 0;
        System.out.println("How many integers will be added:");
        times = Integer.parseInt(input.readLine());
        for (int i = 0; i < times; i++) {
            System.out.println("Enter an integer:");
            num = Integer.parseInt(input.readLine());
            sum += num;
        }
        System.out.println();
        System.out.println("The sum is: " + sum);
    }
}
