package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Book extends Item{
    @Column(length = 15)
    private String isbn;

    @Column(name = "nb_of_pages")
    private Integer nbOfPage;

    @Column(name = "publication_date")
    private LocalDate publicationDate;


    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public Book(Long id, String title, String description, Float unitCost, String isbn, Integer nbOfPage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.unitCost = unitCost;
        this.isbn = isbn;
        this.nbOfPage = nbOfPage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }
}
