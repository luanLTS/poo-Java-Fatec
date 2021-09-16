public class Professor extends Pessoa {
    private int matricula;
    public void lecionar() {
        System.out.printf("%s esta lecionando...\n", getNome());
    }

    public int getMatricula() {
        return matricula;
    }
}