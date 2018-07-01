package LabExercise1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francis Derit
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class deritFTLabExer106 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String buffer = input.readLine();
        System.out.println("Input the radius:");
        double r = Double.parseDouble(buffer), area = Math.PI * r * r;
        System.out.println("The radius is " + r + " The area is: " + area);
    }
}
