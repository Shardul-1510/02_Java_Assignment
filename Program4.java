/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Swap Two Numbers
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program4 {
    public static void main(String[]args)
    {
        int first=10;
        int second=20;
        
        System.out.println("--Before Swapping--");
        System.out.println("First Number="+first);
        System.out.println("Second Number="+second);
        
        int temporary=first;
        first=second;
        second=temporary;
        
        System.out.println("--After Swapping--");
         System.out.println("First Number="+first);
         System.out.println("Second Number="+second);

        
        
    }
}
