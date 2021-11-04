package salarioEmpregadoComPolimorfismo;

public class EmpregadoAssalariadoComissionadoBonificado extends EmpregadoAssalariadoComissionado {
    private double bonus;

    public EmpregadoAssalariadoComissionadoBonificado(double salario, double comissao, double bonus) {
        super(salario, comissao);
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario() {
        double salarioComissao = super.calculaSalario();
        return salarioComissao + bonus;
    }
}

// principio do menos privilegio
// não ha necessidade não implementa