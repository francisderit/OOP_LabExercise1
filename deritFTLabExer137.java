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

public class deritFTLabExer137 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i <= 8; i++)
        {
            for(int j = 0; j < 8-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k < 2*i; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0; i < 3; i++)
        {
            System.out.println("      ***");
        }
    }
}
