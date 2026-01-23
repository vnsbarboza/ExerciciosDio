package ExerciciosDio1.Dominio;

public class Cartão {
    public void aVistaCredito(Produto produto){
        produto.valor = produto.valor - (produto.valor * 0.10);
        System.out.println("O valor do produto com desconto a vista no crédito é: " + produto.valor);
    }
    public void parceladoDuasVezes(Produto produto){
        System.out.println("O valor do produto com em duas vezes no crédito é: " + produto.valor);

    }

    public void parceladoTresVezes(Produto produto){
        produto.valor = produto.valor + (produto.valor * 0.10);
        System.out.println("O valor do produto em tres vezes no crédito é: " + produto.valor);
    }
}
