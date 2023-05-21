
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        String nomes[] = new String[5];
        float notasP[] = new float[5];
        float notasS[] = new float[5];
        float media[] = new float[5];
        float mediaTurma = 0;
        float Somanotas = 0;

        for (int i = 0; i < nomes.length; i++) {
            Scanner entrada = new Scanner(System.in);
            Scanner entrada1 = new Scanner(System.in);

            System.out.println("Digite o nome do aluno:");
            nomes[i] = entrada.nextLine();
            System.out.println("Digite a nota da primeira etapa:");
            notasP[i] = entrada1.nextFloat();
            System.out.println("Digite a nota da segunda etapa:");
            notasS[i] = entrada.nextFloat();
            media[i] = ((notasP[i] + notasS[i]) / 2);
            if (media[i] >= 6) {
                System.out.println("O aluno " + nomes[i] + " foi aprovado!\n");
            } else {
                System.out.println("O aluno " + nomes[i] + " foi reprovado!\n");
            }
            Somanotas += (notasP[i] + notasS[i]);
        }

        mediaTurma = Somanotas / nomes.length;

        for (int x = 0; x < 5; x++) {
            System.out.println("Aluno: " + nomes[x] + " Média: " + media[x]);

        }

        System.out.println("Média da turma: " + mediaTurma);
    }

}
