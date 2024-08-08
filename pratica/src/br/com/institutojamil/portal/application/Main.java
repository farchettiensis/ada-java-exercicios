package br.com.institutojamil.portal.application;

import br.com.institutojamil.portal.login.Login;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Login().autenticacao("jamil", "jamil123"));
    }
}
