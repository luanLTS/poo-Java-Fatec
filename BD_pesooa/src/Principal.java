package src;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "1 - Cadastrar Pessoa\n2 - Atualizar Pessoa\n3 - Apagar Pessoa\n4 - Listar\n0 - Sair";
        int op;
        do {
            System.out.println(menu);
            op = Integer.parseInt(scan.nextLine());

            switch (op) {
                case 1:{
                    System.out.println("Digite o nome:");
                    String nome = scan.nextLine();

                    System.out.println("Digite o telefone:");
                    String fone = scan.nextLine();

                    System.out.println("Digite o email:");
                    String email = scan.nextLine();

                    Pessoa p = new Pessoa(nome, fone, email);
                    p.add();
                    System.out.println("Pessoa cadastrada!");
                    break;
                }
                case 2: {
                    System.out.println("Digite o nome: ");
                    String nome = scan.nextLine();

                    System.out.println("Digite o telefone: ");

                    String fone = scan.nextLine();

                    System.out.println("Digite o email: ");
                    String email = scan.nextLine();

                    System.out.println("Digite o codigo: ");
                    long codigo = Long.parseLong(scan.nextLine());

                    Pessoa p = new Pessoa(nome, fone, email, codigo);
                    p.update();
                    System.out.println("Pessoa atualizada!");
                }
                case 3:{
                    System.out.println("Digite o codigo: ");
                    long codigo = Long.parseLong(scan.nextLine());
                    Pessoa.delete(codigo);
                    System.out.println("Pessoa Deletada!");
                    break;
                }
            }
        } while (op != 0);

        scan.close();
    }
}
