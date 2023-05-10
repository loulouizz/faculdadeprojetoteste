package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Servico;

public class ServicoDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_SistemaVendaMQN_jar_1.0-SNAPSHOTPU");
    private static EntityManager em=emf.createEntityManager() ;
    private static EntityTransaction etx = em.getTransaction();
    
    public static void insertOrUpdate(Servico s){
        etx.begin();
        em.merge(s);
        etx.commit();
    }
    public static void remove(Servico s){
        etx.begin();
        em.remove(s);
        etx.commit();
    }
    public static List list(String classe){
        return em.createQuery("select s from "+classe+" s").getResultList();
    }
    
}