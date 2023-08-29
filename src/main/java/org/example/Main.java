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

//        AuthorService service = new AuthorService(em );
//        Author author = new Author("mohamed","mohran", "mohran is known as the best clown in his life ",date("01/09/2000"),23, ENFLISH) ;
//
//        // CREATES AND  PERSISTS AND AUTHOR
//        tx.begin();
//        author = service.createAuthor(author);
//        tx.commit();
//        Long id = author.getId();
//
//        System.out.println("Author Persisted : " + author);
//
//        // FIND AUTHOR IN THE DB
//        author= service.findAuthor(id);
//        System.out.println("Author Found : "+ author );
//
//        // REMOVES THE AUTHOR FROM THE DB
//        tx.begin();
//        service.removeAuthor(author);
//        tx.commit();
//        System.out.println("Author Removed !!! ");
//
//        // TRY TO FIND AUTHOR THAT NOT FOUND IN THE DB
//        author = service.findAuthor(id);
//        System.out.println("Author Not Found : "+ author);


        em.close();
        emf.close();

    }
}