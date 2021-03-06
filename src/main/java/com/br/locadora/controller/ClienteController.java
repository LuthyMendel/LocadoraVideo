
package com.br.locadora.controller;

import com.br.locadora.model.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.br.locadora.exception.ExceptionDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteController {
    
   public boolean cadastratCliente(String nome, String cpf, String email, String endereco, String dataNascimento) throws ParseException, ExceptionDao{
       if(nome !=null && nome.length()>0 && validarCPF(cpf) && email !=null && email.length()>0 
               && endereco !=null && endereco.length()>0 && validarData(dataNascimento)){
       
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           Date data= formato.parse(dataNascimento);
           
           Cliente cliente = new Cliente(nome, cpf, email, endereco, data);
           
           cliente.cadastrarCliente(cliente);
           return true;
       
       }
       
   return false;
   }
   
   //Valida apenas se o que esta sendo digitado é número ou não
   public boolean validarCPF(String cpf){
       
         for(int i=0; i<cpf.length();i++){
       
             if(!Character.isDigit(cpf.charAt(i))){//verifica se não é um digito
                 if(!(i==3 || i ==7 || i==11)){   //verifica a posição do número
                 return false;
                 }
            }
       
        }
     return true;
    }
   
   
      //Valida apenas se o que esta sendo digitado é número ou não
   public boolean validarData(String data){
       
         for(int i=0; i<data.length();i++){
       
             if(!Character.isDigit(data.charAt(i))){//verifica se não é um digito
                 if(!(i==2 || i ==5)){   //verifica a posição do número
                 return false;
                 }
            }
       
        }
     return true;
    }
   
   
     public ArrayList<Cliente> buscarClientes(String Nome)throws ExceptionDao{
    
        return new Cliente().buscarCliente(Nome);
    
    }
     
     
    
    
   public boolean alterarCliente(int codigo, String nome, String cpf, String email, String endereco, String dataNascimento) throws ParseException, ExceptionDao{
       
         
       if(nome !=null && nome.length()>0 && validarCPF(cpf) && email !=null && email.length()>0 
               && endereco !=null && endereco.length()>0 && validarData(dataNascimento)){
       
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           Date data= formato.parse(dataNascimento);
           
           Cliente cliente = new Cliente(nome, cpf, email, endereco, data);
           cliente.setCodCliente(codigo);
           cliente.alterarCliente(cliente);
           return true;
       
       }
       
   return false;
   }
   
   public boolean excluirCliente (int codCliente) throws ExceptionDao{
       
     if(codCliente == 0){
        return false;
     }else{
         Cliente cliente = new Cliente();
         cliente.setCodCliente(codCliente);
         cliente.excluirCliente(cliente);
         
           return true;
     }
       

   }
    
   
}