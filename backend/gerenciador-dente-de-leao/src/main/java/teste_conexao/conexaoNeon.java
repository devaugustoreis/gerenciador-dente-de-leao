package teste_conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexaoNeon {
    // Substitua pelos dados do seu banco no Neon
    private static final String URL = "jdbc:postgresql://ep-holy-frost-a539lhg1-pooler.us-east-2.aws.neon.tech/gerenciador_dente_de_leao?sslmode=require";
    private static final String USUARIO = "gerenciador_dente_de_leao_owner";
    private static final String SENHA = "npg_rCKqYJ8ojzi0";

    public static Connection conectar() {
        Connection conexao = null;
        try {
            // Conectar ao banco
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado com sucesso ao Neon!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
        return conexao;
    }

    public static void createTableTest(){
        try{
            Connection conexao = conectar();
            Statement stmt = conexao.createStatement();
            String sql = """
                CREATE TABLE IF NOT EXISTS teste (
                    id SERIAL PRIMARY KEY,
                    nome VARCHAR(100)
                )
            """;

            stmt.executeUpdate(sql);
            System.out.println("Tabela 'clientes' criada com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        createTableTest();
    }
}
