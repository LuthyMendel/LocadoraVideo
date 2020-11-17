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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDao{

        String sql = "select * from cliente where nome like '%" + nome + "%' order by nome ";
        Connection connection = null;
        PreparedStatement pStatement = null;

        ArrayList<Cliente> clientes = null;

        try {
            connection = new ConnectionMVC().getConection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                clientes = new ArrayList<Cliente>();
                while (rs.next()) {
                    Cliente cliente = new Cliente();

                    cliente.setCodCliente(rs.getInt("codigo"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setDataNascimento(rs.getDate("dtNascimento"));
   
                    clientes.add(cliente);
                }

            }

        } catch (SQLException e) {
            throw new ExceptionDao("Erro ao consultar Cliente: " + e);
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

        return clientes;

    }
    
    //Alterar
    public void AlterarCliente(Cliente cliente) throws ExceptionDao{
              
         String sql = "Update  cliente set nome= ?, cpf=?, email =?, endereco=?, dtNascimento=? where codigo = ?";
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
                pStatement.setInt(6, cliente.getCodCliente());

                pStatement.execute();
        } catch (SQLException e) {

            throw new ExceptionDao("Erro ao Alterar Cliente"+e);
        }finally{
            try {
                if(pStatement !=null){
                pStatement.close();
                } 
            }catch(SQLException e){
                        throw new ExceptionDao("Erro ao Alterar o Statement: "+e);
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
