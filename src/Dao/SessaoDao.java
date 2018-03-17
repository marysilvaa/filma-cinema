/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.bean.Sessao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariane
 */
public class SessaoDao {
    private Connection con;
    
    public SessaoDao() {
        this.con =  new ConnectionFactory().getConnection();
}
public boolean add(Sessao se){
       String sql = "INSERT INTO Sessao(sessao, nomefilme, salaz, datasessao) VALUES (?,?,?,?);";
       
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, se.getSessao());
            stmt.setString (2, se.getFilme().getNomefilme());
            stmt.setInt(3, se.getSala().getSala());
            stmt.setString(4, se.getDatasessao());
            stmt.execute();
            stmt.close();
            con.close();
      
        return true;    
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
}
