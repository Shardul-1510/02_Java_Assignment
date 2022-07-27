/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java Program to Swap Numbers in Cyclic Order Using Call by Reference
package practiseexample;

/**
 *
 * @author SHARDUL
 */
public class Program47 {
    public int minSwapsCouples(int[] row) {
    int res = 0, N = row.length;
    
    int[] ptn = new int[N];    
    int[] pos = new int[N];
    
    for (int i = 0; i < N; i++) {
        ptn[i] = (i % 2 == 0 ? i + 1 : i - 1);
        pos[row[i]] = i;
    }
    
    for (int i = 0; i < N; i++) {
        for (int j = ptn[pos[ptn[row[i]]]]; i != j; j = ptn[pos[ptn[row[i]]]]) {
			swap(row, i, j);
			swap(pos, row[i], row[j]);
			res++;
		}
    }
    
    return res;
}

private void swap (int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}
}
