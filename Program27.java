/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Programs To Create Pyramid and Pattern
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program27 {
    public static void main(String[]args)
    {
        int rows=5,k=0;
        for(int i=1;i<=rows;++i,k=0)
        {
            for(int space=1;space<=rows-i;++space)
            {
                System.out.print(" ");
            }
            while(k!=2*i-1)
            {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
