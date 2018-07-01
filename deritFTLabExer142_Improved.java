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

public class deritFTLabExer142_Improved {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double balance, monthlyPayment, monthlyInterest, totalPayments = 0;
        System.out.println("Enter your balance:");
        balance = Double.parseDouble(input.readLine());
        System.out.println("Enter the montly interest:");
        monthlyInterest = Double.parseDouble(input.readLine());
        System.out.println("Enter the montly payment:");
        monthlyPayment = Double.parseDouble(input.readLine());
        int i = 1;
        while (balance > 0) {
            balance += balance * monthlyInterest / 100;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}
