
package com.br.locadora.dao;

 

import com.br.locadora.exception.ExceptionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.br.locadora.model.Filme;
import javax.swing.JOptionPane;

public class FilmeDao {


public void cadastrarFilme(Filme filme) throws ExceptionDao, InstantiationException, IllegalAccessException{

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
    
}    
    
