package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Funcionario;

public class FuncionarioDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_SistemaVendaMQN_jar_1.0-SNAPSHOTPU");
    private static EntityManager em=emf.createEntityManager() ;
    private static EntityTransaction etx = em.getTransaction();
    
    public static void insertOrUpdate(Funcionario f){
        etx.begin();
        em.merge(f);
        etx.commit();
    }
    public static void remove(Funcionario f){
        etx.begin();
        em.remove(f);
        etx.commit();
    }
    public static List list(String classe){
        return em.createQuery("select f from "+classe+" f").getResultList();
    }
    
}