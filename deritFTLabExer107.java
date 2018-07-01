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
public class deritFTLabExer107 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String buffer = input.readLine();
        System.out.println("Input the cents:");
        int cents = Integer.parseInt(buffer), dollars = cents / 100;
        System.out.println("That is " + dollars + " dollars and " + (cents % 100) + " cents");   
    }
}
