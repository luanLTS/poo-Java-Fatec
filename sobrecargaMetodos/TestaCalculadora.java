import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String[] args) {
        // Sistem.in abre um recurso alocando recursos
        Scanner scan = new Scanner(System.in); // abstração que permite capturar valores
        Calculadora calc = new Calculadora();
        int opcao;
        String menu = "1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair\n";
        do {
            System.out.println(menu);
            opcao = scan.nextInt();
            System.out.println("Digite o primeiro operando");
            int a = scan.nextInt();
            System.out.println("Digite o segundo operando");
            int b = scan.nextInt();
            int result = 0;
            switch (opcao) {
                case 1:
                    result = calc.soma(a, b);
                    break;
                case 2:
                    result = calc.subtracao(a, b);
                    break;
                case 3:
                    result = calc.multiplicacao(a, b);
                    break;
                case 4:
                result = calc.divisao(a, b);
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue; // pula direto para a proxima iteracao
                case 0:
                    System.out.println("Até logo");
                    return;
            }
            System.out.printf("REsultado = %d\n", result);
        }while (opcao != 0);

        scan.close(); // identifica para o SO que os recursos alocados para o scanner não são mais necessarios
    }
}