/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find Factorial
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program11 {
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }     
}
