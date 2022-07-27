/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Calculate Power of a Number
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program17 {
    public static void main(String[]args)
    {
        int base=3,exponent=4;
        long result=1;
        for(;exponent !=0; --exponent)
        {
            result *=base;
        }
        System.out.println("Answer="+result);
    }
}
