package com.example.demo.beer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BeerController {

    private BeerRepository repository;

    public BeerController( BeerRepository repository ) {

        this.repository = repository;
    }

    @GetMapping( value = "/allBeers", produces = "application/json" )
    Collection<Beer> list() {

        return repository.findAll();

    }

    @GetMapping( value = "/beersByState/{state}", produces = "application/json" )
    Collection<Beer> listbeersByState( @PathVariable String state ) throws Exception {

        checkNameLength( state );
        return repository.findBeerByStateContainingIgnoreCase( state );
    }

    void checkNameLength( String state ) throws Exception {

        if ( state.length() < getMinimumLength() ) {
            throw new Exception( "State is too short." );
        }
    }

    private int getMinimumLength() {

        return 4;
    }

    @GetMapping( value = "/beers/{isGreat}", produces = "application/json" )
    Collection<Beer> listisGreat( @PathVariable Boolean isGreat ) {

        return repository.findBeerByIsGreat( isGreat );
    }

    @PostMapping( value = "/addBeer/{nameOfBeer}/{state}", produces = "application/json" )
    Beer addBeer( @PathVariable String nameOfBeer, @PathVariable String state) {

        Beer beer = new Beer();
        beer.setName( nameOfBeer );
        beer.setState( state );

        return repository.save( beer );
    }

}