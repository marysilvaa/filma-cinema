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
public class Sala {
private int idsala;
private int qntcadeiras; 

    public Sala(int num, int qntcadeiras) {
        this.idsala = idsala;
        this.qntcadeiras = qntcadeiras;
    }
    public Sala(){

    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public int getQntcadeiras() {
        return qntcadeiras;
    }

    public void setQntcadeiras(int qntcadeiras) {
        this.qntcadeiras = qntcadeiras;
    }

   
}
