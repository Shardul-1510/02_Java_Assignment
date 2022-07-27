/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Calculate Average of Numbers Using Arrays
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program40 {
 

    public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}   

