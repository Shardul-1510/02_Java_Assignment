/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Check Whether Number is Even or Odd
package practiseexample;

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;
public class Program5 {
    public static void main(String[]args)
    {
        Scanner reader= new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=reader.nextInt();
        
        if(num % 2==0)
            System.out.println(num + "is even");
        else
           System.out.println(num + "is odd"); 
    }
    
}
