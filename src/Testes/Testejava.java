package Testes;

import Dao.SessaoDao;
import Model.bean.Filme;
import Model.bean.Sala;
import Model.bean.Sessao;





/**
 *
 * @author mariane
 */
public class Testejava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Filme f = new Filme();
        Sala sa = new Sala();
        Sessao se = new Sessao();
        se.setHorario("21:00");
        se.setNomefilme(f);
        se.setNum(sa);
        se.setDatasessao("16/03/2018");
        
        
        
        SessaoDao dao  = new SessaoDao();
        dao.add(se);
        
        
        
        
    }
    
}
