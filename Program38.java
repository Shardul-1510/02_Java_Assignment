/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java program to Reverse a Sentence Using Recursion
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program38 {
    
  public static void main(String[] args) {
    String sentence = "Go work";
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}

