/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Display Fibonacci Series
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program13 {
    public static void main(String[]args)
    {
        int n=10,firstTerm=0,secondTerm=1;
        System.out.println("Fibonacci Series Till" +n+ "terms:");
        for(int i=1;i<=n;++i)
        {
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
