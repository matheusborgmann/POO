package Avaliacao2_AcademiaDeGinastica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        String stringDeConexao = "jdbc:mysql://localhost:3306";
        String usuario = "root";
        String senha = "";

        System.out.println("Abrindo conexao...");

        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
    }
}
