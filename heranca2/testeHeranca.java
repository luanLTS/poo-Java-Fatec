public class testeHeranca {
    public static void main(String[] args) {
        alunoGraduacao aluno = new alunoGraduacao();
        aluno.nota1 = 10;
        aluno.nota2 = 5.2;
        aluno.nome = "Mario";
        aluno.idade = 19;

        System.out.printf("Nome: %s \n Idade: %s\n", aluno.nome, aluno.idade);
    }
}