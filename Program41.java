/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Find Largest Element of an Array
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program41 {
    
public static int getLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Largest: "+getLargest(a,6));  
System.out.println("Largest: "+getLargest(b,7));  
}
}  

