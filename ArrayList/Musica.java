public class Musica implements Comparable<Musica> {
    private String titulo;
    private int avaliacao;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public int compareTo(Musica o) {
        if (this.avaliacao < o.avaliacao)
            return -1; // se o primeiro é menor
        if (this.avaliacao == o.avaliacao)
            return 0; // se for igual
        return 1; // se o segundo é maior
    }

    @Override
    public String toString() {
        // return super.toString();
        return String.format("Música: %s, Avaliação: %d", this.titulo, this.avaliacao);
    }
}