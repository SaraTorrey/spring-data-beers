package com.example.demo.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeerDataLoader {

    @Autowired
     BeerRepository repository;

    @PostConstruct
    public void loadBeerTestData( ) throws Exception {

        Beer beer = new Beer();
        beer.setName( "Pils" );
        beer.setGreat( true );
        beer.setState( "Germany" );
        repository.save( beer );

        repository.save( new Beer("St Arnold", true, "Texas") );
        repository.save( new Beer("Heineken", false, "Holland") );
        repository.save( new Beer("Karbach", true, "Texas") );
        repository.save( new Beer("Coors Light", true, "Colorado") );
        repository.save( new Beer("Miller Light", false, "Wisconsin") );
        repository.save( new Beer("Dos Equis", true, "Mexico") );

        repository.findAll().forEach( System.out:: println);
    }
}