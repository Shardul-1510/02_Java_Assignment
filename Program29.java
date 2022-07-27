/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Display Prime Numbers Between Two Intervals Using Functions
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program29 {
   public static void main(String[]args)
   {
       int low=20,high=50;
       while(low<high)
       {
           if(checkPrimeNumber(low))
               System.out.println(low+"");
               ++low;
       }
   }
public static boolean checkPrimeNumber(int num)
{
    boolean flag=true;
for(int i=2;i<=num/2;++i)
{
    if(num%i==0)
    {
         flag = false;
        break;
    }
    }
return flag;
}
}