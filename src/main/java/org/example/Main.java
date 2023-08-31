package org.example;
import org.example.Author;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import static org.example.Language.ARABIC;
import static org.example.Language.ENFLISH;
import static org.example.Util.date;

public class Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Just-learning-jpa");
         EntityManager em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();

        ItemService service = new ItemService(em);

        // Creates and persists a CD
        tx.begin();
        CD cd = new CD("Sergent Pepper", "Pop/Rock");
        cd = service.createCD(cd);
        tx.commit();

        System.out.println("CD Persisted : " + cd);

        // Creates and persists a Book
        tx.begin();
        Book book = new Book("H2G2", "1234-4567-5678");
        book = service.createBook(book);
        tx.commit();

        System.out.println("Book Persisted : " + book);


        em.close();
         emf.close();

    }
}