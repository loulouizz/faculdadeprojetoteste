package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Produto;

public class ProdutoDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_SistemaVendaMQN_jar_1.0-SNAPSHOTPU");
    private static EntityManager em=emf.createEntityManager() ;
    private static EntityTransaction etx = em.getTransaction();
    
    public static void insertOrUpdate(Produto p){
        etx.begin();
        em.merge(p);
        etx.commit();
    }
    public static void remove(Produto p){
        etx.begin();
        em.remove(p);
        etx.commit();
    }
    public static List list(String classe){
        return em.createQuery("select p from "+classe+" p").getResultList();
    }
    
}