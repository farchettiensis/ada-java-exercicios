package br.com.farchettiensis.sql;

import java.sql.Connection;
import java.sql.Statement;

public class EstudanteDAO {
    ConexaoBD db = new ConexaoBD();

    public void createTableIfNotExists() {
        String sql = "create table if not exists ESTUDANTE (id int primary key auto_increment, nome varchar(255) not null);";
        try {
            Connection connection = db.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
