/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.locadora.controller;

import com.br.locadora.exception.ExceptionDao;
import com.br.locadora.model.Filme;
import java.util.ArrayList;

/**
 *
 * @author procopio
 */
public class FilmeController {
    
    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duracao) throws ExceptionDao, InstantiationException, IllegalAccessException{
    
    if(titulo != null && titulo.length() > 2 && genero !=null && genero.length() >2 &&sinopse!=null && sinopse.length()>2 && duracao > 0){
    
        Filme filme = new Filme(titulo,  genero,  sinopse,  duracao);
        filme.cadastrarFilme(filme);

        return true;    
    }
    
        return false;
    
    }
    
public ArrayList<Filme> listarFilmes(String nome)throws ExceptionDao{

    return new Filme().listarFilmes(nome);

}
    
}
