
package com.br.locadora.controller;
import com.br.locadora.exception.ExceptionDao;


import com.br.locadora.model.Ator;
import java.util.ArrayList;

public class AtorController {
    
    public boolean cadastrarAtor(String nome, String nacionalidade) throws ExceptionDao {
        
        if (nome != null && nome.length() > 1 && nacionalidade != null && nacionalidade.length() > 1) {
            
            Ator ator = new Ator(nome, nacionalidade);
            ator.cadastrarAtor(ator);
            return true;
        }
        return false;
    }
    
    public ArrayList<Ator> listarAtores(String nome) throws ExceptionDao {
        
        return new Ator().listarAtores(nome);
        
    }
    
    
    public boolean alterarAtor(Integer codAtor, String nome, String nacionalidade) throws ExceptionDao {
        
        if (nome != null && nome.length() > 1 && nacionalidade != null && nacionalidade.length() > 1) {
            
            Ator ator = new Ator(nome, nacionalidade);
            ator.setCodAtor(codAtor);
            ator.alterarAtor(ator);
            return true;
        }
        return false;
    }
    
     public boolean excluirAtor(int codigo) throws ExceptionDao {
        
        if (codigo == 0) {
           
            return false;
        }else{
        
        Ator ator = new Ator();

            ator.setCodAtor(codigo);
            ator.excluirAtor(ator);
            return true;
        }
    }
    
}
