package org.example;

import javax.persistence.*;
import java.time.LocalDate;
@Table(name = "t_author")
@Entity
public class Author{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
    @Column(name = "first_name", length = 50)
     private String firstName;
    @Column(name = "last_name", nullable = false)
     private String lastName;
    @Column(length = 5000)
    private String bio;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Transient
    private Integer age;
     private Language language;

    public Author() {
    }

    public Author(String firstName, String lastName, String bio, LocalDate dateOfBirth, Integer age, Language language) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
