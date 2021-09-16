public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista horista = new ProfessorHorista();
        ProfessorPesquisador pesquisador = new ProfessorPesquisador();
        horista.setNome("Marcos");
        pesquisador.setNome("Marcelo");
        horista.lecionar();
        pesquisador.lecionar();
    }
}