import java.util.Random;

public class For {
    public static void main(String[] args) {
        Random gen = new Random();
        double n1, n2;
        // inicialização com ou sem declaracao
        // teste de continuidade
        // incremento
        // for ( ; ; ){ Loop infinito como se fosse um while(true)

        // }

        for (int i = 1; i <= 5; i++) {
            n1 = gen.nextDouble() * 10;
            n2 = gen.nextDouble() * 10;
            System.out.println(
                String.format("Media %d = %.2f", i, (n1 + n2) /2)
            );
        }

    }
}