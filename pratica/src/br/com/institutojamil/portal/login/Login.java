package br.com.institutojamil.portal.login;

import br.com.institutojamil.portal.constants.Constants;

public class Login {
    public String autenticacao(String usuario, String senha) {
        if (usuario.equals(MockDataBase.adminUserName)) {
            if (senha.equals(MockDataBase.adminPassword)); {
                return "sucesso";
            }
        }
        return Constants.MENSAGEM_LOGIN_INVALIDO;
    }
}
