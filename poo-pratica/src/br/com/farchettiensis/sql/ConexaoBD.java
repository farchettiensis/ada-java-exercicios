package br.com.farchettiensis.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/ada", "root", "KingTerry@2018");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
