package ExerciciosDio1.Teste;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor logico (true ou false): ");
        boolean v1 = scanner.nextBoolean();

        System.out.println("Digite outro valor logico (true ou false): ");
        boolean v2 = scanner.nextBoolean();

       boolean ambosSaoVerdadeiros = v1 && v2;
       boolean ambosSaoFalsos = !v1 && !v2;

       if(ambosSaoVerdadeiros){
           System.out.println("Ambos sao verdadeiros");
       } else if(ambosSaoFalsos){
           System.out.println("Ambos sao falsos");
       } else{
           System.out.println("Um falso e um verdadeiro");
       }



    }
}
