
// por ela ser uma classe concreta de uma classe abstrata (empregado) ela precisa sobreescrever o metodo calculaSalario()
public class EmpregadoAssalariado extends Empregado {
    private double salario;

    public EmpregadoAssalariado(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaSalario() {
        return salario;
    }


    // public double getSalario() {
    //     return this.salario;
    // }

    // public void setSalario(double salario) {
    //     this.salario = salario;
    // }

}
