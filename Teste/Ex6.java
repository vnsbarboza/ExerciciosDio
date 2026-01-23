package ExerciciosDio1.Teste;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n1 = scanner.nextDouble();

        double n1Reajuste = (n1 * 0.05) + n1;

        System.out.println("Seu numero com um reajuste de 5%: " + n1Reajuste);

    }
}
