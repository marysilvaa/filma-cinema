/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 * É uma classe que pega os atributos da sala e faz uma conexão com o banco de dados.
 * @author mariane
 */
public class Sala {
    
    private int idsala;
    private int qntcadeiras; 
    
    public Sala() {
    
}
    /**
     * Esse método pega os atributos de sala.
     * @param idsala
     * @param qntcadeiras 
     */
    public Sala(int idsala, int qntcadeiras) {
        this.idsala = idsala;
        this.qntcadeiras = qntcadeiras;
  
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
    public int getQntcadeiras() {
        return qntcadeiras;
    }
/**
 * 
 * @param qntcadeiras 
 */
    public void setQntcadeiras(int qntcadeiras) {
        this.qntcadeiras = qntcadeiras;
    }

  
    }
    
