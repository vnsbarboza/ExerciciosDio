package ExerciciosDio1.Dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase, String cpf) {
        super(nome, salarioBase, cpf);
    }
    protected double bonusSalarial = 0.15;



}
