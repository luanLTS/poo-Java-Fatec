import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        Random gen = new Random();
        double n1, n2;
        //? repeticao controlada por contador
        int i = 10;

        do{
            n1 = gen.nextDouble() * 10;
            n2 = gen.nextDouble() * 10;
            double result = (n1 + n2) / 2;
            System.out.printf("Media %d = %.2f\n", i, result);
            ++i;
        }
        while (i <= 10);
        System.out.println("Até mais");
    }    
}