package org.example;
import org.example.Author;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;

import static org.example.Language.ARABIC;
import static org.example.Language.ENFLISH;
import static org.example.Util.date;

public class Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Just-learning-jpa");
         EntityManager em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();

         CDService service = new CDService(em);
         // ccreate and persists the CD
         tx.begin();
         CD cd = service .createCD(new CD("Selling England by the pound","5th studio album by the progressive rock band Genesis", 12.5F, 53.39F, "Progressive Rock"));
         tx.commit();
         System.out.println("CD persisted  : " + cd  );

         // finds the cd by primary key
        cd = service.findCD(cd.getId());
        System.out.println("CD Found   :" + cd);
        // delete the  cd
        tx.begin();
        service.removeCD(cd.getId());
        tx.commit();
        System.out.println("CD Removed !!!!!!!!!");

        // find the cd by the primary key
        cd = service.findCD(cd.getId()) ;
        System.out.println("cd not found : "+cd);


         em.close();
         emf.close();

    }
}