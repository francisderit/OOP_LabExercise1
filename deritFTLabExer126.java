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

public class deritFTLabExer126 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int leftFront, rightFront, leftRear, rightRear;
        boolean goodPressure = true;
        String error = "Warning: Pressure is out of range\n";
        System.out.println("Input right front pressure");
        rightFront = Integer.parseInt(input.readLine());
        if (rightFront < 35 || rightFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Input left front pressure");
        leftFront = Integer.parseInt(input.readLine());
        if (leftFront < 35 || leftFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Input right rear pressure");
        rightRear = Integer.parseInt(input.readLine());
        if (rightRear < 35 || rightRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Input left rear pressure");
        leftRear = Integer.parseInt(input.readLine());
        if (leftRear < 35 || leftRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear  && goodPressure ? "OK" : "BAD"));
    }
}
