/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Check Armstrong Number
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program24 {
 public static void main(String[]args)
 {
     int number=371,OriginalNumber,remainder,result=0;
     OriginalNumber=number;
     while(OriginalNumber!=0)
     {
         remainder=OriginalNumber%10;
         result+=Math.pow(remainder,3);
         OriginalNumber /=10;
     }
     if(result==number)
         System.out.println(number+"is an Armstrong number");
     else
         System.out.println(number+"is not an Armstrong number");
 }
}
