public class Pessoa {
    private String nome;
    private int idade;
    private int altura;
    private String endereco;

/*     Pessoa(){ // construtor padrao da classe Pessoa
        System.out.println("Construindo pessoa!");
    } */

    Pessoa(String nome, int idade, int altura) {
        this(nome, idade, altura, null);
    }

    Pessoa(int idade, String nome, int altura) { // é o mesmo códido do const acima so muda a assinatura
        //podemos chamar o construtor de cima para não repetir codigo
        this(nome, idade, altura); // só podeter ou o this, ou o super
        
    }

    Pessoa (String nome, int idade, int altura, String endereco) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setEndereco(endereco);
    }

    Pessoa (String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    Pessoa() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
   }

   public void setAltura(int altura) {
       this.altura = altura;
   }

   public void setEndereco(String endereco) {
       this.endereco = endereco;
   }
}