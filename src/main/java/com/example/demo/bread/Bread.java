package com.example.demo.bread;

import javax.persistence.Entity;

@Entity
public class Bread {

    private Long id;
    private String name;
    private Boolean isTasty;
    private String country;

    public Bread() {

    }

    public Bread(  String name, Boolean isTasty, String country ) {

        this.name = name;
        this.isTasty = isTasty;
        this.country = country;
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



    public Boolean getTasty() {

        return isTasty;
    }

    public void setTasty( Boolean tasty ) {

        isTasty = tasty;
    }







    public String getCountry() {

        return country;
    }

    public void setCountry( String country ) {

        this.country = country;
    }


    @Override public String toString() {

        return "Bread{" +
               "country='" + country + '\'' +
               ", id=" + id +
               ", isTasty=" + isTasty +
               ", name='" + name + '\'' +
               '}';
    }

    public Boolean setIsDelicious( boolean b ) {

    }
}