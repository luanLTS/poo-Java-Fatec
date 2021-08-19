import java.util.Scanner;

public class IfElseEncadeado {
    public static void main(String... args) { // ?...: varargs
        Scanner scan = new Scanner(System.in);

        long nota = scan.nextLong();

        if (nota >= 90) {
            System.out.println("Parabéns");
            System.err.println("Conceito A");
        } else if (nota >= 80)
            System.err.print("Conceito %s\n", "B");
        else if (nota >= 70)
            System.err.println("Conceito C");
        else 
            System.err.println("Conceito R");
    }
}
