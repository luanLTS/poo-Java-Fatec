import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) { 
        //? o lLivroDeNotas agora é um tipo de dados já que definimos a classe LivroDeNotas
        LivrosDeNotas livro1; //? variavel de referencia (tipo um ponteiro do C)
        livro1 = new LivrosDeNotas(); //? new instancia um objeto
        livro1.nomeDoCurso = JOptionPane.showInputDialog("Qual o nome do curso?");
        livro1.exibirMensagem(); //? . operador de acesso à membro
        
        LivrosDeNotas livro2 = new LivrosDeNotas();
        livro2.nomeDoCurso = JOptionPane.showInputDialog("Qual o nome do curso?");
        livro2.exibirMensagem();
        
        System.out.println("Terminando...");
    }
}