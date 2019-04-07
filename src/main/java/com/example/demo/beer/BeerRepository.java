package com.example.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RepositoryRestResource (collectionResourceRel = "beer-api", path = "beer-api")
interface BeerRepository extends JpaRepository<Beer, Long> {

    List<Beer> findBeerByName( String name );
    List<Beer> findBeerByStateContainingIgnoreCase( String state );
    List<Beer> findBeerByIsGreat( Boolean isGreat );

}