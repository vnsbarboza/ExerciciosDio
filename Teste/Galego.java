package ExerciciosDio1.Teste;

import java.util.Scanner;

public class Galego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Galego ta quanto o cachorro quente?");
        String suco = scanner.nextLine();

        if(suco == "Com suco ou sem o suco?"){
            System.out.println("Eu perguntei o cachorro quente");
        }

        System.out.println("Eu perguntei o cachorro quente");
        String suco2 = scanner.nextLine();

        if(suco2 == "5 real o cachorro quente"){
            System.out.println("e com o suco ?");
        } else{
            System.out.println("e com o suco ?");
        }

        String suco3 = scanner.nextLine();

        if(suco3 == "Ta fazendo pergunta demais macho"){
            System.out.println("e so o suco");
        } else{
            System.out.println("e so o suco");
        }
    }
}
