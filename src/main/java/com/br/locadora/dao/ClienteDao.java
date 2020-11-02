/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.locadora.dao;

import com.br.locadora.exception.ExceptionDao;
import com.br.locadora.model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {
    
    public void cadastrarCliente(Cliente cliente) throws ExceptionDao{

         String sql = "insert  into cliente(nome, cpf,email,endereco,dtNascimento) value (?,?,?,?,?)";
         PreparedStatement pStatement = null;
         Connection connection = null;
    
        try {
            connection = new ConnectionMVC().getConection();
                pStatement = connection.prepareStatement(sql); 
                pStatement.setString(1, cliente.getNome());
                pStatement.setString(2, cliente.getCpf());
                pStatement.setString(3, cliente.getEmail());
                pStatement.setString(4, cliente.getEndereco());
                pStatement.setDate(5, new Date(cliente.getDataNascimento().getTime()));
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
