import java.util.Random;

public class TesteVetorDinamicoAumentaDiminuir {
    public static void main(String[] args) throws Exception {
        VetorDinamico v = new VetorDinamico();
        Random gen = new Random();

        while (true) {
            boolean ehParaInserir = gen.nextBoolean();
            if (ehParaInserir) {
                int elemento = gen.nextInt(20) + 1;
                v.add(elemento);
            } else {
                v.remover();
            }
            v.show();
            System.out.println("------------------------------------------------------------");
            Thread.sleep(3000);
        }
    }
}