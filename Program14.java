/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find GCD
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program14 {
    public static void main(String[]args)
    {
        int x=112,y=8,gcd=1;
        for(int i=1;i<=x && i<=y;i++)
        {
            if(x % i==0 && y% i ==0)
                gcd=i;
        }
        System.out.printf("GCD of %d and %d is:%d",x,y,gcd);
    }
}
