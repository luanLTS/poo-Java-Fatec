public class professorPesquisador {
    private String nome;
    private int idade;

    public void pesquisar() {
        System.out.printf("%s está pesquisando!", nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}