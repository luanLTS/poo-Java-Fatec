public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome () {
        return this.nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public int getidade() {
        return this.idade;
    }

    public double calculaSalario () {
        if (tipo == 1) return salario;
        else if (tipo == 2) return (salario + salario * comissao);
        else if (tipo == 3) return (salario + bonus);
        else return 0;
    }
}