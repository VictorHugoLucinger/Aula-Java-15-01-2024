import java.sql.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Conectando ao banco de dados...");
        conectar();
    }

    public static Connection conectar() {
        String status = "Nada aconteceu ainda...";
        String mysqhost = "127.0.0.1";
        String mysqDb = "mysql_connector";
        String mysqUser = "Victor";
        String mysqPassword = "";
        String mysqUrl = "jdbc:mysql://" + mysqhost + "/" + mysqDb + "?user=" + mysqUser + "&password=" + mysqPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(mysqUrl);
            status = "Conexão realizada com sucesso!";
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            status = "Opss! algo de errado não está certo com a conexão com o banco de daods MySQL! mensagem do servidor : " + e;
            
        }
        System.out.println(status);
        return conn;
    }
}
