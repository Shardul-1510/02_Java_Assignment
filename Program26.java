/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Display Factors of a Number
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program26 {
   public static void main(String[]args)
   {
       int number=60;
       System.out.print("Factors of "+number+"are");
   for(int i=1;i<=number;++i)
   {
       if(number%i==0)
       {
           System.out.print(i+" ");
       }
   }
   }
}
