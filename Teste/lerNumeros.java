package ExerciciosDio1.Teste;

import java.util.Scanner;

public class lerNumeros {
    public static void main(String[] args) {




        //Faça um algoritmo que leia os valores de A, B, C e
        // em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double resultado = A + B;

        System.out.println("Resultado de A + B: " + resultado);

        if (resultado < C){
            System.out.println("O resultado de A + B é menor que C");
        } else{
            System.out.println("O resultado de A + B é maior que C");
        }

    }
}
