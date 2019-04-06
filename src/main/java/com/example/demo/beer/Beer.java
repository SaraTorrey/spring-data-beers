package com.example.demo.beer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Boolean isGreat;
    private String state;

    public Beer() {

    }

    public Beer( String name, Boolean isGreat, String state ) {

        this.name = name;
        this.isGreat = isGreat;
        this.state = state;

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

    public Boolean getGreat() {

        return isGreat;
    }

    public void setGreat( Boolean great ) {

        isGreat = great;
    }

    public String getState() {

        return state;
    }

    public void setState( String state ) {

        this.state = state;
    }

    @Override public String toString() {

        return "Beer{" +
               "id=" + id +
               ", isGreat=" + isGreat +
               ", name='" + name + '\'' +
               ", state='" + state + '\'' +
               '}';
    }
}
