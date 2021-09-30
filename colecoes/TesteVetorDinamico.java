import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) {
        Random gen = new Random(); // gen gera valores aleatórios de 0 a 1
        
        VetorDinamico vetD = new VetorDinamico();
        for(int i = 0; i < 10; i++) {
            vetD.show();
            int aleatorio = gen.nextInt(10) + 1;// o numero de dentro é o limite superios (0 - 9)
            vetD.add(aleatorio);
        }
    }
}
