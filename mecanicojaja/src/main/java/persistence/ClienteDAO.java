package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Cliente;

public class ClienteDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_SistemaVendaMQN_jar_1.0-SNAPSHOTPU");
    private static EntityManager em=emf.createEntityManager() ;
    private static EntityTransaction etx = em.getTransaction();
    
    public static void insertOrUpdate(Cliente c){
        etx.begin();
        em.merge(c);
        etx.commit();
    }
    public static void remove(Cliente c){
        etx.begin();
        em.remove(c);
        etx.commit();
    }
    public static List list(String classe){
        return em.createQuery("select o from "+classe+" o").getResultList();
    }
    
}