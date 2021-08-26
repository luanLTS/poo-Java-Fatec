public class TesteLivroDeNotas {
    public static void main(String[] args) { 
/*         LivrosDeNotas livro = new LivrosDeNotas("ADS");
        livro.setNomeCurso("ADS");
        System.out.println(livro.getNomeCurso());
        livro.exibirMensagem(); */

        LivrosDeNotas livro1 = new LivrosDeNotas("ADS");
        LivrosDeNotas livro2 = new LivrosDeNotas("CCP");
        System.out.println(livro1.getNomeCurso());
        System.out.println(livro2.getNomeCurso());
        livro1 = livro2; //? l1 agora aponta para o mesmo obj que l2
        System.out.println(livro1.getNomeCurso()); // CCP
        System.out.println(livro2.getNomeCurso()); // CCP

    }
}