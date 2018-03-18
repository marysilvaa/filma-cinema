package Testes;

import Dao.SessaoDao;
import Model.bean.Sessao;


/**
 *
 * @author mariane
 */
public class Testejava {

    /**Esse é um teste de inserir as coisas no banco de dados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Sessao se = new Sessao();
         se.setHorario("03:10");
         se.setIdfilme(2);
         se.setIdsala(3);
         se.setDatasessao("15/09/2018");
         
         
        
         SessaoDao dao  = new SessaoDao();
         if (dao.add(se)){
             System.out.println("Cadastrado");
         }else{ 
             System.out.println("Não Cadastrado");
         }
             
         }
         
        
    }
