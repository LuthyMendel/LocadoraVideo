
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
    
}
