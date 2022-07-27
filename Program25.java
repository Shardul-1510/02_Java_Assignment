/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Display Armstrong Number Between Two Intervals
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program25 {
    public static void main(String[]args)
    {
        int low=999,high=99999;
        for(int number=low+1;number<high;++number)
        {
            int digits=0;
            int result=0;
            int OriginalNumber=number;
            
            while(OriginalNumber!=0)
            {
                OriginalNumber /=10;
                ++digits;
            }
            OriginalNumber=number;
            while(OriginalNumber!=0)
            {
                int remainder=OriginalNumber%10;
                result +=Math.pow(remainder,digits);
                OriginalNumber /=10;
            }
            if(result==number)
            {
                System.out.print(number+" ");
            }
        }
    }
}
