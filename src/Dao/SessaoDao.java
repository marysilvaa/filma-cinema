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
 *SessaoDa é a implementação do FilmeDao, da SalaDao e do Dao.
 * @author mariane
 */
public class SessaoDao {
   
    private Connection con;
    
    /**
     * Automaticamente vai gerar uma conexão com a SessaoDAo.
     * @param con.
     */
    public SessaoDao(){
        this.con = new ConnectionFactory().getConnection();
                
    }
    /**
     * Vai inserir os valores da tabela Sessao.
     */
    public boolean add(Sessao se){
        String sql = "INSERT INTO Sessao(horario, idfilme, idsala, datasessao) VALUES(?,?,?,?); ";
        
    /**
     * Pega a String e ler, quando ele achar os pontos de interrogação e vai marcar quantos pontos de interrogação tem.
     * retorna true.
     */    
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, se.getHorario());
            stmt.setInt(2, se.getIdfilme());
            stmt.setInt(3, se.getIdsala());
            stmt.setString(4, se.getDatasessao());
            stmt.execute();
            return true;
            
    /**
     * Caso dê um erro no execute ele vem pro catch.
     * retorna false.
     */        
            
        } catch (SQLException ex) {  
            Logger.getLogger(SessaoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
  }
    
}
