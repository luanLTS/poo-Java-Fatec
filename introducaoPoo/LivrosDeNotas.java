public class LivrosDeNotas {
    //? variavel de instancia == cada instancia vai ter sua cópia
    private String nomeCurso;

    //? construtor
    public LivrosDeNotas (String nomeCurso) {
        System.out.println("Executando o construtor...");
        //! o this. referencia para a variavel que a que vai receber o parametro é o do objeto, não o proprio parametro
        this.setNomeCurso(nomeCurso);
    }

    //* getter e setter
    public void setNomeCurso (String s) {
        if (s.length() >= 3)
            nomeCurso = s; //! this implicito
    }

    public String getNomeCurso () {
        return nomeCurso; //! this implicito
    }

    public void exibirMensagem() {
        // System.out.println(nomeDoCurso);
        System.out.printf("Bem vindo ao livro de notas do curso %s!\n", getNomeCurso());// elementos da mesma classe se enxergam
    }
}