/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Display Prime Numbers Between Two Intervals
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program23 {
    public static void main(String[]args)
    {
        int low=20,high=50;
        while(low<high)
        {
            boolean flag=false;
            for(int i=2;i<=low/2;++i)
            {
                if(low%i==0)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag && low !=0 && low!=1)
                System.out.print(low+"");
            ++low;
        }
    }
}
