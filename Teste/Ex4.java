package ExerciciosDio1.Teste;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        int antecessor = n1 - 1;
        int sucessor = n1 + 1;
        System.out.println("Antecessor a esse numero: " + antecessor);
        System.out.println("Sucessor a esse numero: " + sucessor);

    }
}
