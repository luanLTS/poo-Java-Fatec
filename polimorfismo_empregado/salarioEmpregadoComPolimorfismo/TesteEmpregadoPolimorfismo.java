package salarioEmpregadoComPolimorfismo;

import java.util.*;
public class TesteEmpregadoPolimorfismo {
    public static void main(String[] args) {
        Random gen = new Random();
        List<Empregado> empregados = new ArrayList<>(10);
        for ( int i = 0; i < empregados.size(); i++ ) {
            int tipo = gen.nextInt(4) + 1;
            switch(tipo) {
                case 1: { // as chaves faz a restrição de escopo, todas as variaveis declaradas dentro do case são apagadas da memoria
                    double salario = 2000 + gen.nextDouble() * 1000;
                    empregados.add(new EmpregadoAssalariado(salario));
                    break;
                }
                case 2: { 
                    double salario = 1500 + gen.nextDouble() * 1000;
                    double comissao = gen.nextDouble() * 0.2;
                    empregados.add(new EmpregadoAssalariadoComissionado(salario, comissao));
                    break;
                }
                case 3: { 
                    double salario = 1500 + gen.nextDouble() * 1000;
                    double comissao = gen.nextDouble() * 0.2;
                    double bonus = 200;
                    empregados.add(new EmpregadoAssalariadoComissionadoBonificado(salario, comissao, bonus));
                    break;
                }

                case 4: {
                    double valorHora = 20 + gen.nextDouble() * 30;
                    double horasTrabalhadas = 100 + gen.nextDouble() * 100;
                    empregados.add(new EmpregadoHorista(valorHora, horasTrabalhadas));
                }
            }
        }
        for (int i = 0; i < empregados.size(); i++) {
            System.out.printf("Empregado %d: %2.f\n", i + 1, empregados.get(i).calculaSalario());
        }
    }
}
