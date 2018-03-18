/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 * É uma classe que faz conexão com o banco de dados, que mostra os atributos gerais do filme.
 * @see FilmeDao.
 * @author mariane
 * @author Damarês
 */
public class Filme  {
    
     private Long idfilme;
     private String nomefilme; 
     private String duracao;
     private String genero;
     private String classificacao;

     public Filme() {
         
     }
/**
 * Esse método pega todos os atributos.
 * @param idfilme 
 * @param nomefilme
 * @param duracao
 * @param genero
 * @param classificacao 
 */
    public Filme(Long idfilme, String nomefilme, String duracao, String genero, String classificacao) {
        this.idfilme = idfilme;
        this.nomefilme = nomefilme;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacao = classificacao;
      
      
    }
/**
 * 
 * @return 
 */
    public Long getIdfilme() {
        return idfilme;
    }
/**
 * 
 * @param idfilme 
 */
    public void setIdfilme(Long idfilme) {
        this.idfilme = idfilme;
    }
/**
 * 
 * @return 
 */
    public String getNomefilme() {
        return nomefilme;
    }
/**
 * 
 * @param nomefilme 
 */
    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }
/**
 * 
 * @return 
 */
    public String getDuracao() {
        return duracao;
    }
/**
 * 
 * @param duracao 
 */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
/**
 * 
 * @return 
 */
    public String getGenero() {
        return genero;
    }
/**
 * 
 * @param genero 
 */
    public void setGenero(String genero) {
        this.genero = genero;
    }
/**
 * 
 * @return 
 */
    public String getClassificacao() {
        return classificacao;
    }
/**
 * 
 * @param classificacao 
 */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
   
}

