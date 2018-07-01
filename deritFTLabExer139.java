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

public class deritFTLabExer139 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int low, high, data, inRange = 0, notInRange = 0;
        System.out.println("In-range Adder");
        System.out.println("Low end of range:");
        low = Integer.parseInt(input.readLine());
        System.out.println("High end of range:");
        high = Integer.parseInt(input.readLine());
        while (true) {
            System.out.println("Enter data:");
            data = Integer.parseInt(input.readLine());
            if (data == 0)
                break;
            if (data >= 20 && data <= 50)
                inRange += data;
            else
                notInRange += data;
        }
        System.out.println("Sum of in range values: " + inRange);
        System.out.println("Sum of out range values: " + notInRange);
    }
}
