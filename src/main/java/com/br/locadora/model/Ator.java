
package com.br.locadora.model;

import java.util.ArrayList;


public class Ator {
    
    private Integer codAtor;
    private String nome;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();

    public Ator( String nome, String nacionalidade) {        
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Integer getCodAtor() {
        return codAtor;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setCodAtor(Integer codAtor) {
        this.codAtor = codAtor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void cadastrarAtor(Ator ator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
