
package com.br.locadora.model;

import com.br.locadora.dao.FilmeDao;
import com.br.locadora.exception.ExceptionDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Filme {
    
    private Integer codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private ArrayList<Item> itens = new ArrayList<Item>();
    private ArrayList<Ator> atores = new ArrayList<Ator>();

    
    public Filme(){}
    public Filme( String titulo, String genero, String sinopse, Integer duracao) {

        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public Integer getCodFilme() {
        return codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }

    public void cadastrarFilme(Filme filme) throws ExceptionDao, InstantiationException{
        
        new FilmeDao().cadastrarFilme(filme);
    }
 
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDao{
    
    return new FilmeDao().listarFilmes(nome);
    
    }
}
