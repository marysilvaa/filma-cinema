/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *A classe Filme e a classe Sala se liga com essa classe.
 * @see Filme.
 * @see Sala.
 * @author mariane
 */
public class Sessao {
    
   private int idsessao; 
   private String horario;
   private int idfilme; 
   private int idsala;
   private String datasessao;
   
  
    public Sessao(){
   
    }
/** Esse método pega os atributos de Filme, Sala e Sessao.
 * 
 * @param idsessao
 * @param horario
 * @param idfilme
 * @param idsala
 * @param datasessao 
 */
    public Sessao(int idsessao, String horario, int idfilme, int idsala, String datasessao) {
        this.idsessao = idsessao;
        this.horario = horario;
        this.idfilme = idfilme;
        this.idsala = idsala;
        this.datasessao = datasessao;
    
    }
/**
 * 
 * @return 
 */
    public int getIdsessao() {
        return idsessao;
    }
/**
 * 
 * @param idsessao 
 */
    public void setIdsessao(int idsessao) {
        this.idsessao = idsessao;
    }
/**
 * 
 * @return 
 */
    public String getHorario() {
        return horario;
    }
/**
 * 
 * @param horario 
 */
    public void setHorario(String horario) {
        this.horario = horario;
    }
/**
 * 
 * @return 
 */
    public int getIdfilme() {
        return idfilme;
    }
/**
 * 
 * @param idfilme 
 */
    public void setIdfilme(int idfilme) {
        this.idfilme = idfilme;
    }
/**
 * 
 * @return 
 */
    public int getIdsala() {
        return idsala;
    }
/**
 * 
 * @param idsala 
 */
    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }
/**
 * 
 * @return 
 */
    public String getDatasessao() {
        return datasessao;
    }
/**
 * 
 * @param datasessao 
 */
    public void setDatasessao(String datasessao) {
        this.datasessao = datasessao;
    }

  
}


