
package com.br.locadora.dao;

import com.br.locadora.exception.ExceptionDao;
import com.br.locadora.model.Ator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    
    
    public ArrayList<Ator> listarAtores(String nome) throws ExceptionDao{

        String sql = "select * from ator where nome like '%" + nome + "%' order by nome ";
        Connection connection = null;
        PreparedStatement pStatement = null;

        ArrayList<Ator> atores = null;

        try {
            connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                atores = new ArrayList<Ator>();
                while (rs.next()) {
                    Ator ator = new Ator();

                    ator.setCodAtor(rs.getInt("codigo"));
                    ator.setNome(rs.getString("nome"));
                    ator.setNacionalidade(rs.getString("nacionalidade"));

                    atores.add(ator);
                }

            }

        } catch (SQLException e) {
            throw new ExceptionDao("Erro ao consultar Ator: " + e);
        } finally {

            try {

                if (pStatement != null) {
                    pStatement.close();
                }

            } catch (SQLException e) {

                throw new ExceptionDao("Erro ao fechar o pStatement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {

                throw new ExceptionDao("Erro ao fechar a conexão");
            }
        }

        return atores;

    }
    
    public void alterarAtor (Ator ator) throws ExceptionDao{
    String sql ="Update ator set nome=?, nacionalidade=? where codigo = ?";
    
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try {
            connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareCall(sql);
            pStatement.setString(1, ator.getNome());
            pStatement.setString(2, ator.getNacionalidade());
            pStatement.setInt(3, ator.getCodAtor());
         
            pStatement.execute();

        } catch (SQLException e) {
            throw new ExceptionDao("Erro ao Alterar Ator: " + e);
        } finally {

            try {

                if (pStatement != null) {
                    pStatement.close();
                }

            } catch (SQLException e) {

                throw new ExceptionDao("Erro ao fechar o pStatement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {

                throw new ExceptionDao("Erro ao fechar a conexão");
            }

        }

    }
    
    public void excluirAtor(Ator ator) throws ExceptionDao {

        String sql = "delete from ator where codigo = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        try {
            connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, ator.getCodAtor());
            
            pStatement.execute();
        } catch (SQLException e) {

            throw new ExceptionDao("Erro ao Excluir Ator" + e);
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
