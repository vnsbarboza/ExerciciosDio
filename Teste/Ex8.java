package ExerciciosDio1.Teste;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        }
        else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            }
        }
        else {
            if (n1 > n2) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }
        }

    }
}
