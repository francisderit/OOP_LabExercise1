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
import java.util.*;
public class deritFTLabExer105 {
    public static void main(String[] args) {
        double degrees = 30, rad = degrees * Math.PI / 180;
        double sinx = Math.sin(rad), cosx = Math.cos(rad), sum = sinx * sinx + cosx * cosx;
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum:" + sum);
    }
}
