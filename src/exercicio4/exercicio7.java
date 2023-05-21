
package exercicio4;

import java.util.Arrays;

public class exercicio7 {
    public static void main(String[] args) {
        int numeros[]={23, 56,98, 12, 4, 7, 19, 4, 12, 3};
        int soma=0, quantidade=0;
        float media;
       
        
        for (int i = 0; i <numeros.length; i++) {
            if (numeros[i]%2 !=0){
                soma += numeros[i];
                quantidade++;
            }
        }
        media=soma/quantidade;
       System.out.printf("Array: %s \n", Arrays.toString(numeros));
        System.out.println("Média aritimética dos números ímpares do Array: "+media);
    }
}
