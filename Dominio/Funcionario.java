package ExerciciosDio1.Dominio;

public class Funcionario {
    protected  String nome;
    protected String cpf;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase, String cpf) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cpf = cpf;
    }

    public double calcularSalarioBase(){
        return this.salarioBase;
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
