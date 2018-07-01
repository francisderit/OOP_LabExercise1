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

public class deritFTLabExer128 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int start, end;
        System.out.println("Enter Start:");
        start = Integer.parseInt(input.readLine());
        System.out.println("Enter End:");
        end = Integer.parseInt(input.readLine());
        System.out.println();
        for (int i = start; i <= end; i++)
            System.out.println(i);
    }
}
