/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java program to Calculate Factorial of a Number Using Recursion
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program33 {
      static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  


