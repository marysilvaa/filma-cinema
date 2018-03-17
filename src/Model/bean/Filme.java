/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author mariane
 */
public class Filme extends Entidade {
    
private String nomefilme; 
private String duracao;
private String genero;
private String classificacao;

    public Filme(String nomefilme, String duracao, String genero, String classificacao) {
        this.nomefilme = nomefilme;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacao = classificacao;
      
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
   

   
}

