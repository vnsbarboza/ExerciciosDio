package ExerciciosDio1.Dominio;

public class Dinheiro {

   public void aVista(Produto produto){
       produto.valor =  produto.valor- (produto.valor * 0.15);
       System.out.println("O valor do produto com desconto a vista é: " + produto.valor);
   }

}
