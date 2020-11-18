
package com.br.locadora.model;

import com.br.locadora.exception.ExceptionDao;
import java.util.ArrayList;
import java.util.Date;
import com.br.locadora.dao.ClienteDao;


public class Cliente {
    
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date dataNascimento;
    private ArrayList<Item> itens = new ArrayList<Item>();
    
    public Cliente(){}

    public Cliente(String nome, String cpf, String email, String endereco, Date dataNascimento) {
        
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void cadastrarCliente(Cliente cliente) throws ExceptionDao{
        
        new ClienteDao().cadastrarCliente(cliente);
       
    }
    
    
    public ArrayList<Cliente> buscarCliente(String nome) throws ExceptionDao{
        
        return  new ClienteDao().listarClientes(nome);
        
    }
   
    public void alterarCliente (Cliente cliente) throws ExceptionDao{
    
        new ClienteDao().AlterarCliente(cliente);
    
    }
    
     public void excluirCliente (Cliente cliente) throws ExceptionDao{
         
    
        new ClienteDao().ExcluirCliente(cliente);
    
    
    }
    
}
