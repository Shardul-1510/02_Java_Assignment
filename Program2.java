/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find Quotient and Remainder
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program2 {
  
    public static void main(String[]args)
    {
        int dividend= 587; 
                int divisor = 2;
        
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        
        System.out.println("The Quotient is =" + quotient);
        System.out.println("The Remainder is=" + remainder);
    }
}
