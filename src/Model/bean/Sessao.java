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
public class Sessao {
private String horario;
private Filme Filme; 
private Sala idsala;
private String datasessao;

    public Sessao(String horario, Filme nomefilme, Sala num, String datasessao) {
        this.horario = horario;
        this.nomefilme = nomefilme;
        this.num = num;
        this.datasessao = datasessao;
    }
    public Sessao(){

    }

  
    
    }
 
