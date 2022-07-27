/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find Largest Number Among Three Numbers

package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program7 {
    public static void main(String[]args)
    {
        int a=70;
        int b=40;
        int c=100;
        
        if(a>=b && a>=c)
            System.out.println(a+ " is the largest number");
        else if (b>=a && b>=c)
            System.out.println(b+ " is the largest number");
        else
            System.out.println(c+ " is the largest number");
    }
}
