package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Produtos_usados;

public class ProdutosUsadosDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.unigran_SistemaVendaMQN_jar_1.0-SNAPSHOTPU");
    private static EntityManager em=emf.createEntityManager() ;
    private static EntityTransaction etx = em.getTransaction();
    
    public static void insertOrUpdate(Produtos_usados pu){
        etx.begin();
        em.merge(pu);
        etx.commit();
    }
    public static void remove(Produtos_usados pu){
        etx.begin();
        em.remove(pu);
        etx.commit();
    }
    public static List list(String classe){
        return em.createQuery("select pu from "+classe+" pu").getResultList();
    }
    
}