/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.locadora.controller;

import com.br.locadora.model.Ator;

/**
 *
 * @author procopio
 */
public class AtorController {
    
    public boolean cadastrarAtor(String nome, String nacionalidade){
    
        if(nome != null && nome.length()>1 && nacionalidade != null && nacionalidade.length()>1){
        
            Ator ator = new Ator(nome, nacionalidade);
            ator.cadastrarAtor(ator);
            return true;
        
        }
    return false;
    }
    
}
