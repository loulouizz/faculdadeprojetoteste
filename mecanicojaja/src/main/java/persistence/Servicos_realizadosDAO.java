package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Servicos_realizados;

public class Servicos_realizadosDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_SistemaVendaMQN_jar_1.0-SNAPSHOTPU");
    private static EntityManager em=emf.createEntityManager() ;
    private static EntityTransaction etx = em.getTransaction();
    
    public static void insertOrUpdate(Servicos_realizados sr){
        etx.begin();
        em.merge(sr);
        etx.commit();
    }
    public static void remove(Servicos_realizados sr){
        etx.begin();
        em.remove(sr);
        etx.commit();
    }
    public static List list(String classe){
        return em.createQuery("select sr from "+classe+" sr").getResultList();
    }
    
}