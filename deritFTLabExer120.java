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
        
public class deritFTLabExer120 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        double price;
        System.out.println("Enter the item:");
        String item = input.readLine();
        System.out.println("Enter the price:");
        price = Double.parseDouble(input.readLine());
        System.out.println("Overnight delivery (0==no, 1==yes)");
        int overnight = Integer.parseInt(input.readLine());
        double shipping = price >= 10 ? 3 : 2;
        if (overnight == 1)
            shipping += 5;
        System.out.println("Invoice:");
        System.out.println(item + "\t" + price);
        System.out.println("shipping\t" + shipping);
        System.out.println("total\t" + (price + shipping));
    }
}
