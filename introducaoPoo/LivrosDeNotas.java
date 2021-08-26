public class LivrosDeNotas {
    //? variavel de instancia == cada instancia vai ter sua cópia
    String nomeDoCurso;

    public void exibirMensagem() {
        // System.out.println(nomeDoCurso);
        System.out.printf("Bem vindo ao livro de notas do curso %s!", nomeDoCurso);// elementos da mesma classe se enxergam
    }
}