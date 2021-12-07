package src;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Pessoa {
    private long codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa (String nome, String fone, String email){
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa (String nome, String fone, String email, long codigo){
        this(nome, fone, email);
        this.codigo = codigo;
    }

    public void add() {
        // 1. especificar o comando sql
        try {
        String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?)"; // as ? são onde os valores vão entrar (placeholders)

        // 2. abrir uma conexao
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.obterConexao();

        // 3. pre compilar comando
            PreparedStatement ps = con.prepareStatement(sql); // pre compila o comando, prepara o sql server para receber valores
    
            // 4. preencher dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
    
            // 5. executar o comando
            ps.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void update () {
        ConnectionFactory factory = new ConnectionFactory();

        // try with resources
        // 1. abrir uma conexao
        try(Connection con = factory.obterConexao();) {
            // 2. especificar o comando sql
            String sql = "UPDATE tb_pessoa set nome = ?, fone = ?, email = ? where codigo=?";
            // 3. pre compilar comando
            PreparedStatement ps = con.prepareStatement(sql);
            // 4. preencher dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setLong(4, codigo);
            // 5. executar o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

/*         try {
            // 1. abrir uma conexao
            ConnectionFactory factory = new ConnectionFactory();
            con = factory.obterConexao();
    
            // 2. especificar o comando sql
            // 3. pre compilar comando
            // 4. preencher dados faltantes
            // 5. executar o comando
            con.close();
        } catch (Exception e) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } */

    }

    public static void delete (long codigo) {
        ConnectionFactory factory = new ConnectionFactory();
        
        //try with resources
        try(Connection con = factory.obterConexao()) {
            String sql = "DELETE FROM tb_pessoa where codigo=?";
            //!!! perguntar para o professor se essa pre compilação é como se fosse o EXPLAIN do postgre!!!
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, codigo);
            ps.execute();
            con.close();
        } catch(Exception e){
            e.printStackTrace();
        }    
    }
}

    