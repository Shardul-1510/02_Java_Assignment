/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find the Number of Vowels, Consonants, Digits and White Spaces in a String
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program49 {
   
    public static void main(String[] args) {    
            
        
        int vCount = 0, cCount = 0;    
            
            
        String str = "This is a really simple sentence";    
            
           
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
              
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                
                vCount++;    
            }    
             
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                   
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    
}   

