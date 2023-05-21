

package exercicio4;

import java.util.Arrays;

public class exercicio6 {
    public static void main(String[] args) {
        int a[] = {23, 44, 69, 21, 9, 1, 34, 98, 809, 12};
        int b[] = {98, 120, 45, 47, 2, 76, 234, 198, 22, 13};
        int c[] = new int[10];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i] + b[i];
        }
        
         System.out.printf("\nVetor A: %s \n" ,Arrays.toString(a));
         System.out.printf("\nVetor B: %s \n",Arrays.toString(b));
         System.out.printf("\nVetor C (Soma dos anteriores): %s \n",Arrays.toString(c));
    }
}
