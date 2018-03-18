/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.bean.Filme;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *FilmeDao é a implementação do Dao.
 * @author mariane
 */
public class FilmeDao {
    private Connection con;
    
    /**
     * Automaticamente vai gerar uma conexão com o FilmeDAo.
     * @param con.
     */
    public FilmeDao(){
        this.con = new ConnectionFactory().getConnection();
                
    }
    /**
     * Vai inserir os valores da tabela Filme.
     */
    public boolean add(Filme f){
        String sql = "INSERT INTO Filme(nomefilme, duracao, genero, classificacao) VALUES(?,?,?,?); ";
        
    /**
     * Pega a String e ler, quando ele achar os pontos de interrogação e vai marcar quantos pontos de interrogação tem.
     * retorna true.
     */  
    
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNomefilme());
            stmt.setString(2, f.getDuracao());
            stmt.setString(3, f.getGenero());
            stmt.setString(4, f.getClassificacao());
            stmt.execute();
            return true;
            
    /**
     * Caso dê um erro no execute ele vem pro catch.
     * retorna false.
     */        
            
        } catch (SQLException ex) {  
            Logger.getLogger(FilmeDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
  }
}