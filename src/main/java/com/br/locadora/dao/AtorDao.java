
package com.br.locadora.dao;

import com.br.locadora.exception.ExceptionDao;
import com.br.locadora.model.Ator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtorDao {
    
    
    public void cadastrarAtor(Ator ator) throws ExceptionDao {

        String sql = "insert into ator (nome,nacionalidade) value (?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        try {
            connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, ator.getNome());
            pStatement.setString(2, ator.getNacionalidade());
            pStatement.execute();
        } catch (SQLException e) {

            throw new ExceptionDao("Erro ao Cadastrat filme" + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {

                throw new ExceptionDao("Erro ao fechar o Statement:" + e);
            }
            try {

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDao("Erro ao fechar conexão :" + e);
            }
        }

    }

}
