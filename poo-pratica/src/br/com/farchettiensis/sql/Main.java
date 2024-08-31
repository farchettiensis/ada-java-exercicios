package br.com.farchettiensis.sql;

public class Main {
    public static void main(String[] args) {
        EstudanteDAO dao =  new EstudanteDAO();
        dao.createTableIfNotExists();
    }
}
