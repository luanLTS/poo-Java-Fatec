public class Empregado {
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private double valorHora;
    private double horasTrabalhadas;
    private int numeroTarefas;
    private double valorTarefa;

    public Empregado(int tipo) {
        this.tipo = tipo;
    }


    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorTarefa(double valorTarefa) {
        this.valorTarefa = valorTarefa;
    }

    public double getValorTarefa() {
        return valorTarefa;
    }

    public void setNumeroTarefas(int numeroTarefas) {
        this.numeroTarefas = numeroTarefas;
    }

    public int getNumeroTarefas() {
        return numeroTarefas;
    }
}
