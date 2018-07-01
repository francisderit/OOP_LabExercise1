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

public class deritFTLabExer125 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int leftFront, rightFront, leftRear, rightRear;
        System.out.println("Input right front pressure");
        rightFront = Integer.parseInt(input.readLine());
        System.out.println("Input left front pressure");
        leftFront = Integer.parseInt(input.readLine());
        System.out.println("Input right rear pressure");
        rightRear = Integer.parseInt(input.readLine());
        System.out.println("Input left rear pressure");
        leftRear = Integer.parseInt(input.readLine());
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear ? "OK" : "BAD")); 
    }
}
