import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TesteEmpregradoSemPolimorfismo {
    public static void main(String[] args) {
        Random gen = new Random();
        List<Empregado> empregados; //variavel de referencia para uma objetos lista de empregados
        empregados = new ArrayList<>();

        //isso siimula um acesso a uma base de datos
        // a estrutua de selecao usada não nos preocupa

        for (int i = 0; i < 10; i++) {
            int tipo = gen.nextInt(5) + 1;
            Empregado e = new Empregado(tipo);
            switch (tipo) {
                case 1:
                    e.setSalario(2000 + gen.nextDouble() * 1200); // varia entre 2000 e 3200
                    break;
                case 2:
                    e.setSalario(1800 + gen.nextDouble() * 700);
                    e.setComissao(gen.nextDouble() * 0.2); // maximo de 20 % de comissao
                    break;
                case 3:
                    e.setSalario(1500 + gen.nextDouble() * 500);
                    e.setComissao(gen.nextDouble() * 0.15);
                    e.setBonus(500 + gen.nextDouble() * 500);
                    break;
                case 4:
                    e.setValorHora(20 + gen.nextDouble() * 50);
                    e.setHorasTrabalhadas(120 + gen.nextDouble() * 40);
                    break;
                case 5:
                    e.setNumeroTarefas(50 + gen.nextInt(21));
                    e.setValorTarefa(100 + gen.nextDouble() * 300);
                    break;
            }

            empregados.add(e);
        }

        //aqui sim, teremos uma estrutura de seleção que sera preocupante

        for (int i = 0; i < empregados.size(); i++) {
            double salarioFinal = 0;
            //ruim, não faca isso

            if (empregados.get(i).getTipo() == 1) {
                salarioFinal = empregados.get(i).getSalario();
            } else if (empregados.get(i).getTipo() == 2) {
                salarioFinal = empregados.get(i).getSalario() + empregados.get(i).getSalario() * empregados.get(i).getComissao();
            } else if (empregados.get(i).getTipo() == 3) {
                salarioFinal = empregados.get(i).getSalario()
                + empregados.get(i).getSalario() * empregados.get(i).getComissao()
                + empregados.get(i).getBonus();
            } else if (empregados.get(i).getTipo() == 4) {
                salarioFinal = empregados.get(i).getHorasTrabalhadas() * empregados.get(i).getValorHora();
            } else if (empregados.get(i).getTipo() == 5) {
                salarioFinal = empregados.get(i).getNumeroTarefas() * empregados.get(i).getValorTarefa();
            }

            System.out.printf("Empregado %d: %.2f\n", i + 1, salarioFinal);
        }
    }
}
