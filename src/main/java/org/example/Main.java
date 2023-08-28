package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        // Create and persists a book
        BookService service = new BookService();
        Book book = service.createBook(4044L,"H2G2","Scifi Book",12.5f,"1234-5678-5678",257);
        System.out.println("Book persisted : "+ book);
        // Finds  the book
        book= service.findBook(4044L);
        System.out.println("Book found  :  "+ book  );
        // Raise the price of the book
        book = service.raiseUnitCost(4044L,12.5f);
        System.out.println("Book updated : "+book  );
        // remove the book
        service.removeBook(4044L);
        System.out.println("Book Removed");
        //finds the book
        book  = service.findBook(4044L);
        System.out.println("Book Not Found : "  + book  );
    }
}