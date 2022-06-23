package Avaliacao2_AcademiaDeGinastica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        String stringDeConexao = "jdbc:mysql://localhost:3306";
        String usuario = "root";
        String senha = "";

        System.out.println("Abrindo conexao...");
        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

        System.out.println("Apagando a base de dados");
        String sql = "DROP DATABASE IF EXISTS academiaB";
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.execute();
        comando.close();

        System.out.println("Criando a base de dados livraria...");
        sql = "CREATE DATABASE academia";
        comando = conexao.prepareStatement(sql);
        comando.execute();
        comando.close();

        System.out.println("Fechando a conexão...");
        conexao.close();
    }
}
