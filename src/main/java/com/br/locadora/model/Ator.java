
package com.br.locadora.model;

import com.br.locadora.dao.AtorDao;
import com.br.locadora.exception.ExceptionDao;
import java.util.ArrayList;


public class Ator {
    
    private Integer codAtor;
    private String nome;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();
    
    public Ator(){}

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

    public void cadastrarAtor(Ator ator) throws ExceptionDao {
        new AtorDao().cadastrarAtor(ator);
    }
    
    
    public ArrayList<Ator> listarAtores(String nome) throws ExceptionDao {

        return new AtorDao().listarAtores(nome);

    }

     public void alterarAtor(Ator ator) throws ExceptionDao{
     
     new AtorDao().alterarAtor(ator);
         
     }
     
      public void excluirAtor(Ator ator) throws ExceptionDao{
     
     new AtorDao().excluirAtor(ator);
         
     }
}
