public class ProfessorPesquisador extends Professor{
    public void pesquisar() {
        System.out.printf("Professor chamado %s cuja matricula numero %d esta pesquisando!\n", getClass(), getMatricula());
    }
}
