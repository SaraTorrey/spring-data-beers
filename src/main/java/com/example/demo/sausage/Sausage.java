package com.example.demo.sausage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sausage {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Boolean isDelicious;
    private String city;

    public Sausage() {

    }

    public Sausage( String name, Boolean isDelicious, String city ) {

        this.name = name;
        this.isDelicious = isDelicious;
        this.city = city;
    }

    public Long getId() {

        return id;
    }

    public void setId( Long id ) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName( String name ) {

        this.name = name;
    }

    public Boolean getDelicious() {

        return isDelicious;
    }

    public void setDelicious( Boolean delicious ) {

        isDelicious = delicious;
    }

    public String getCity() {

        return city;
    }

    public void setCity( String city ) {

        this.city = city;
    }


    @Override public String toString() {

        return "Sausage{" +
               "city='" + city + '\'' +
               ", id=" + id +
               ", isDelicious=" + isDelicious +
               ", name='" + name + '\'' +
               '}';
    }
}