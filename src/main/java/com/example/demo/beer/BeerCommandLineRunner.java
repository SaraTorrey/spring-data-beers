package com.example.demo.beer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeerCommandLineRunner implements CommandLineRunner {

    private final BeerRepository repository;

    public BeerCommandLineRunner( BeerRepository repository ) {

        this.repository = repository;
    }

    @Override public void run( String... args ) throws Exception {

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