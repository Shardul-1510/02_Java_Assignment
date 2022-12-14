/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find All Roots of a Quadratic Equation
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program8 {
   public static void main(String[]args)
   {
       double a=2.3,b=4,c=5.6;
       double root1,root2;
       
       double determinant = b*b-4*a*c;
       if(determinant > 0)
       {
           root1=(-b+Math.sqrt(determinant))/(2*a);
           root2=(-b-Math.sqrt(determinant))/(2*a);
           
           System.out.format("root1=%.2f and root2=%.2f",root1,root2);
       }
       else if (determinant == 0)
       {
           root1=root2=-b/(2*a);
           System.out.format("root1=root2=%.2f;",root1);
       }
       else{
           double real =-b/(2*a);
           double imaginary=Math.sqrt(-determinant)/(2*a);
           System.out.format("root 1=%.2f+%.2fi",real,imaginary);
           System.out.format("root 2=%.2f-%.2fi",real,imaginary);
           
       }
   }
}
