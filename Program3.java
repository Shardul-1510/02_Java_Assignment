/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find Size of int, float, double and char in Your System
package practiseexample;

/**
 *
 * @author SHARDUL
 */
import java.util.*;
public class Program3 {
    public static void main(String[]args)
    {
        System.out.println("Size of Int :" + (Integer.SIZE/8)+"bytes.");
        System.out.println("Size of Float :" + (Float.SIZE/8)+"bytes.");
        System.out.println("Size of Double :" + (Double.SIZE/8)+"bytes.");
        System.out.println("Size of Char :" + (Character.SIZE/8)+"bytes.");
    }
    
}
