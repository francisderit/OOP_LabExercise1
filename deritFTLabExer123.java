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

public class deritFTLabExer123 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int str, hp, luck, total;
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        String name = input.readLine();
        System.out.println("Enter htrength (1-10):");
        str = Integer.parseInt(input.readLine());
        System.out.println("Enter health (1-10):");
        hp = Integer.parseInt(input.readLine());
        System.out.println("Enter luck (1-10):");
        luck = Integer.parseInt(input.readLine());
        total = str + hp + luck;
        if (total > 15) {
            System.out.println("You have given your character too many points! Default values have been assigned:");
            str = 5;
            hp = 5;
            luck = 5;
        }
        System.out.println(name + ", strength: " + str + ", health: " + hp + ", luck: " + luck);
    }
    
}
