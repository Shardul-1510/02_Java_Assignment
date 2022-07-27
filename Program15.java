/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find LCM
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program15 {
 public static void main(String[]args)
 {
     int n1=72,n2=120,lcm;
     lcm=(n1>n2)?n1:n2;
     while(true)
     {
         if( lcm % n1 == 0 && lcm % n2 == 0 )
         {
             System.out.printf("The LCM of %d and %d is %d.",n1,n2,lcm);
             break;
         }
         ++lcm;
     }
 }
}
