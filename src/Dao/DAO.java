package Dao;

import Model.bean.Entidade;
import java.util.List;

/**
 *
 * @author mariane
 */
public interface DAO {

    public void cadastrar(Entidade entidade);
    
    public void excluir(Entidade entidade);
    
    public List<Entidade> consultarTodos();
    
    public Entidade consultar(int id);
    
}
