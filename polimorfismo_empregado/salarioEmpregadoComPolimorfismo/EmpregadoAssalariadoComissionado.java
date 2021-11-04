package salarioEmpregadoComPolimorfismo;

public class EmpregadoAssalariadoComissionado extends EmpregadoAssalariado{
    private double comissao;

    public EmpregadoAssalariadoComissionado(double salario, double comissao) {
        super(salario);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        double salarioBase = super.calculaSalario();
        return salarioBase  + salarioBase * comissao;
    }

    // public double getComissao() {
    //     return comissao;
    // }
}
