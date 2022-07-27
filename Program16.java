/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Reverse a Number
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program16 {
    public static void main(String[]args)
    {
        int num=123456, reversed=0;
        for(;num !=0;num /=10)
        {
            int digit=num%10;
            reversed =reversed *10+digit;
        }
        System.out.println("Reversed Number:"+reversed);
    }
}
