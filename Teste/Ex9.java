package ExerciciosDio1.Teste;

import ExerciciosDio1.Dominio.Cartão;
import ExerciciosDio1.Dominio.Dinheiro;
import ExerciciosDio1.Dominio.Produto;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dinheiro dinheiro = new Dinheiro();
        Cartão cartao = new Cartão();

        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        Produto produto1 = new Produto(valor);


        System.out.println("Digite a opção desejada");
        System.out.println("1 - Para pagamento a vista no dinheiro");
        System.out.println("2 - Para pagamento a vista no crédito");
        System.out.println("3 - Para pagamento a até duas vezes no crédito");
        System.out.println("4 - Para pagamento a até tres vezes no crédito");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1: dinheiro.aVista(produto1);
            break;
            case 2: cartao.aVistaCredito(produto1);
            break;
            case 3: cartao.parceladoDuasVezes(produto1);
            break;
            case 4:cartao.parceladoTresVezes(produto1);
            break;
            default:
                System.out.println("Numero invalido");
        }

    }
}
