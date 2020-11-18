
package com.br.locadora.dao;

 

import com.br.locadora.exception.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.br.locadora.model.Filme;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FilmeDao {


public void cadastrarFilme(Filme filme) throws ExceptionDao, InstantiationException{

    String sql = "insert  into filme(titulo, genero,sinopse,duracao) value (?,?,?,?)";
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try {
        connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareStatement(sql); 
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getGenero());
            pStatement.setString(3, filme.getSinopse());
            pStatement.setInt(4, filme.getDuracao());
            pStatement.execute();
    } catch (SQLException e) {
        
        throw new ExceptionDao("Erro ao Cadastrar filme"+e);
        
    }finally{
        try {
            if(pStatement !=null){
            pStatement.close();
            
            } 
        }catch(SQLException e){
                    throw new ExceptionDao("Erro ao fechar o Statement: "+e);
                    }try {
                        
                        if(connection != null){
                            connection.close();
                        
                        }                
            } catch (SQLException e) {
                throw new ExceptionDao("Erro ao fechar a conexão :"+e);
            }
       } 
    
    
    }

public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDao{

    String sql = "select * from filme where titulo like '%"+nome+"%' order by titulo ";
    Connection connection = null;
    PreparedStatement pStatement =null;
    
    ArrayList<Filme> filmes = null;
    
    try {
        connection = new ConnectionMVC().getConection();
        pStatement =  connection.prepareStatement(sql);
        
        ResultSet rs = pStatement.executeQuery(sql);
        
        if(rs!=null){
            filmes = new ArrayList<Filme>();
            while (rs.next()) {
                Filme filme = new Filme();
                
                filme.setCodFilme(rs.getInt("codigo"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setSinopse(rs.getString("sinopse"));                
                filme.setDuracao(rs.getInt("duracao"));
                
                filmes.add(filme);         
            }

        }

    } catch (SQLException e) {
        throw  new ExceptionDao("Erro ao consultar Filmes: "+e);
    }finally{
    
        try {
            
            if(pStatement!=null){
                pStatement.close();
            }

        } catch (SQLException e) {
            
            throw  new ExceptionDao("Erro ao fechar o pStatement: "+e);
        }try {
            if(connection !=null){
            connection.close();
            }
        } catch (SQLException e) {
            
            throw new ExceptionDao("Erro ao fechar a conexão");
        }
    }
 
    return filmes;
    
}

public void alterarFilme (Filme filme) throws ExceptionDao{
    String sql ="Update Filme set titulo=?, genero=?, sinopse=?, duracao=? where codigo = ?";
    
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try {
            connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareCall(sql);
            pStatement.setString(1, filme.getTitulo());
            pStatement.setString(2, filme.getGenero());
            pStatement.setString(3, filme.getSinopse());
            pStatement.setInt(4, filme.getDuracao());
            pStatement.setInt(5, filme.getCodFilme());
            pStatement.execute();

        } catch (SQLException e) {
            throw new ExceptionDao("Erro ao Alterar Filmes: " + e);
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

public void excluirFilme(Filme filme) throws ExceptionDao{
    

    String sql = "delete from filme where codigo = ?";
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try {
        connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareStatement(sql); 
            pStatement.setInt(1, filme.getCodFilme());
        
            pStatement.execute();
    } catch (SQLException e) {
        
        throw new ExceptionDao("Erro ao Excluir filme"+e);
        
    }finally{
        try {
            if(pStatement !=null){
            pStatement.close();
            
            } 
        }catch(SQLException e){
                    throw new ExceptionDao("Erro ao fechar o Statement: "+e);
                    }try {
                        
                        if(connection != null){
                            connection.close();
                        
                        }                
            } catch (SQLException e) {
                throw new ExceptionDao("Erro ao fechar a conexão :"+e);
            }
       } 
    
    
    }

}
    
