/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.bean.Sala;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * SalaDao é a implementação do Dao.
 *
 * @author mariane
 */
public class SalaDao {

    private final Connection con;
    
     
    /**
     * Automaticamente vai gerar uma conexão com o SalaDAo.
     * @param con.
     */
    public SalaDao(){
        this.con = new ConnectionFactory().getConnection();
                
    }
    /**
     * Vai inserir os valores da tabela Sala.
     */
    public boolean add(Sala sa){
        String sql = "INSERT INTO Sala(idsala, qntcadeiras) VALUES(?,?); ";
        
    /**
     * Pega a String e ler, quando ele achar os pontos de interrogação e vai marcar quantos pontos de interrogação tem.
     * retorna true.
     */    
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, sa.getIdsala());
            stmt.setInt(2, sa.getQntcadeiras());
            stmt.execute();
            return true;
            
    /**
     * Caso dê um erro no execute ele vem pro catch.
     * retorna false.
     */        
            
        } catch (SQLException ex) {  
            Logger.getLogger(SalaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
  }
    
}
