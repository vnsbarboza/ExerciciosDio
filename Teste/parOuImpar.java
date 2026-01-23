package ExerciciosDio1.Teste;

import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {

        //Faça um algoritmo para receber um número qualquer e
        // imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double n1 = scanner.nextDouble();

        double imparOuPar = n1 % 2;


        if(imparOuPar == 0){
            if(n1 > 0){
                System.out.println("O numero é par e maior que 0");
            } else{
                System.out.println("O numero é par e menor que 0");
            }
        }
        else{
            if (n1 > 0){
                System.out.println("O numero é impar e maior que 0");
            }
            else{
                System.out.println("O numero é impar e menor que 0");
            }
        }
    }

}
