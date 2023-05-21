package exercicio4;

import java.util.Scanner;
import java.util.Arrays;

public class exercicio5 {

    public static void main(String[] args) {
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um número");
            num[i] = entrada.nextInt();
        }

        Arrays.sort(num);
        System.out.printf("\n\nVetor Ordenado : %s \n", Arrays.toString(num));
        System.out.println("O maior número é: " + num[(num.length - 1)] + " e o menor número é: " + num[0]);
    }
}
