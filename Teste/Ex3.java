package ExerciciosDio1.Teste;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {


        //- Faça um algoritmo que leia dois valores inteiros A e B,
        // se os valores de A e B forem iguais, deverá somar os dois valores,

        //caso contrário devera multiplicar A por B.
        //Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        if(A == B){
            int C = A+B;
            System.out.println("Soma dos dois valores por serem iguais: " + C);
        } if(A != B){
            int C = A*B;
            System.out.println("Resultado da multiplicação por serem diferentes: " + C);
        }



    }
}
