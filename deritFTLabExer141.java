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

public class deritFTLabExer141 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Computer Aided Design Program");
        while (true) {
            int x1, y1, x2, y2, width, height, area;
            System.out.println("First corner X coordinate:");
            x1 = Integer.parseInt(input.readLine());
            System.out.println("First corner Y coordinate:");
            y1 = Integer.parseInt(input.readLine());
            System.out.println("Second corner X coordinate:");
            x2 = Integer.parseInt(input.readLine());
            System.out.println("Second corner Y coordinate:");
            y2 = Integer.parseInt(input.readLine());
            width = Math.abs(x1 - x2);
            height = Math.abs(y1 - y2);
            if (width == 0 || height == 0) {
                System.out.println("Cannot be a rectangle");
                break;
            }
            area = width * height;
            System.out.println("Width: " + width + " Height: " + height + " Area: " + area + "\n");
        }
    }
}
