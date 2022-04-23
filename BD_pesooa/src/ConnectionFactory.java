package src;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    // geralmente as informacoes de usuario e senha ficam em um arquivo a parte que
    // nao faz parte do versionamento
    // java -> .properts
    // node / JS -> .env
    private String user = "root";
    private String passwd = "root";
    private String host = "localhost";
    private String port = "3306";
    private String db = "pessoas";

    public Connection obterConexao() {
        String connection = String.format(
                "jdbc:mysql://%s:%s/%s",
                host,
                port,
                db);
        try {
            return DriverManager.getConnection(
                    connection,
                    user,
                    passwd);
        } catch (Exception e) {
            e.printStackTrace(); // pilha de chamada de metodo
            System.out.println("Não conectou erro -> " + e);
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        System.out.println(factory.obterConexao());
    }
}